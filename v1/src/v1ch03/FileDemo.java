package v1ch03;

/**
 * 使用 Scanner方法操作文本文件
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) throws IOException /*告知编译器Scanner(path)可能存在异常*/ {

        //以下打印出由IDE控制的启动路径位置，方便使用相对路径
        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        //以下读取文本文件内容，使用默认的utf-8编码
        String path = "resource\\v1ch03\\";
        Scanner sc = new Scanner(Paths.get(path + "fileA.txt"));
        PrintWriter out = new PrintWriter(path + "fileB.txt"); //不存在则创建，非追加模式写入
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            out.println(nextLine);
        } //这种拷贝多了一个空白行
        sc.close();

        //可以像System.out一样使用print/printf/println命令
        Date date = new Date();
        out.printf("%1$s %2$tB %2$te,%2$tY\n", "Due date:", date);
        double x = 10000 / 3.0;
        out.println(x);

        out.close();

        //注意以下用法,不是读文件，而是将字符串参数解释为数据
        Scanner scfromStr = new Scanner("resource\\v1ch03\\fileA.txt");
        while (scfromStr.hasNextLine()) {
            System.out.println(scfromStr.nextLine());
        }
        scfromStr.close();
    }

}
