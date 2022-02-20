package v1ch03;

import java.util.Locale;

//java中的String类包含了50多个方法，绝大多数都很有用
public class StringApiDemo {
    public static void main(String[] args) {

        //compareTo compareToIgnoreCase方法
        int i = "abcf".compareTo("abcd");
        System.out.println(i); //2

        //startsWith endsWith方法
        if ("HelloWorld.java".endsWith(".java")) {
            System.out.println("This is a Java Class file.");
        }

        //indexof lastIndexOf方法
        int index = "Hello World!".indexOf("or");
        System.out.println(index); //7

        //replace方法  replace(CharSequence oldString, CharSequence newString)
        String s = "Hello world!".replace("Hello", "hello");
        System.out.println(s);

        //substring(int beginIndex, int endIndex) 获得从beginIndex到endIndex-1之间所有的代码单元构成的字符串
        System.out.println("𝕫 is the set of integers.".substring(0, 2)); //substring以代码单元为索引

        //toLowerCase() toUpperCase()
        System.out.println("Hello WoRlD!".toUpperCase());

        //trim() 删除首尾多余空格
        System.out.println(" hello world!   ".trim());

    }
}
