package v1ch03;

import java.util.Scanner;

//不断输入，不断输出
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(in.nextLine());
        }
    }
}
