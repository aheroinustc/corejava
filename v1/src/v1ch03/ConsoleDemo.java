package v1ch03;

import java.io.Console;

//以下例子在IDE下报java.lang.NullPointerException异常
//建议去除包语句，直接在命令行下执行 $javac -encoding utf-8 ConsoleDemo.java
public class ConsoleDemo {

    public static void main(String[] args) {

        //Scanner输入是可见的，不适合终端读取密码，使用Console类代替
        Console console = System.console();


        String userName = console.readLine("User name:");
        char[] passwd = console.readPassword("PassWord:");

        //将字符数组转化为字符串
        String passwdString = String.valueOf(passwd);

        System.out.println("userName:" + userName + "," + "password:" + passwdString);

    }

}
