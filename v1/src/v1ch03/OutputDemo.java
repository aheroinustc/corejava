package v1ch03;

import java.util.Date;

/**
 * 格式化输出：
 */
public class OutputDemo {
    public static void main(String[] args) {

        //print 如果打印数值x， 默认将x对应的数据类型所允许的最大非0数字位数打印输出
        double x = 10000 / 3.0;
        System.out.print(x);
        System.out.print("\n");

        //java沿用了c语言库的printf方法
        System.out.printf("%08.2f", x); //03333.33
        System.out.print("\n");
        System.out.printf("%,8.2f", x); //3,333.33

        System.out.print("\n");

        System.out.printf("%X", -2); //十六进制格式输出

        System.out.print("\n");

        //printf使用多个格式化参数
        String name = "jack";
        int age = 18;
        System.out.printf("hello %s, next year you will be %d.\n", name, age);

        //创建一个格式化的字符串
        String message = String.format("hello %s, next year you will be %d.", name, age);
        System.out.println(message);

        Date date = new Date();
        System.out.printf("%tc\n", date); //指定格式打印当前日期和时间

        //带参数索引的格式化字符串, 索引在%后面以$终止，从1开始
        System.out.printf("%1$s %2$tB %2$te,%2$tY", "Due date:", date);

        System.out.println();
        //还可以使用 < 标志，指示前面的参数被重复利用
        System.out.printf("%s %tB %<te,%<tY", "Due date:", date);


    }
}
