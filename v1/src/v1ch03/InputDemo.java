package v1ch03;

import java.util.Scanner;

/**
 *  读取标准输入流System.in ,通过控制台进行输入，需要构造一个Scanner对象并与System.in相关联。
 *  因为输入是可见的，因此Scanner不适合输入密码。
 *  <p>
 *  可以使用{@code Console}类实现这个目的，请参考{@link v1ch03.ConsoleDemo ConsoleDemo}类
 *  </p>
 *<blockquote><pre>
     Console cons = System.console();
     String username = cons.readLine("User name: ");
     char[] passwd = cons.readPassword("Password: ");
  </pre></blockquote>
 *
 */
public class InputDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //使用Scanner类的各种方法进行输入

        //读取一行输入，可以包含空格，以回车结束
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("Your name is:" + name);

        //读取一个单词，以空白符包括空格为分隔符
        System.out.println("What is your first name?");
        String firstName = in.next();
        System.out.println("Your firstName is :" + firstName);

        //读取上次输入的残留字符
        String others = in.nextLine();
        System.out.println("多余的字符：" + others);

        //读取一个整数,要输入类型一致
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("Your age is:" + age);

        //读取一个浮点数
        System.out.println("What is your height?");
        double height = in.nextDouble();
        System.out.println("Your height is:" + height);

    }
}
