package v1ch03;

import java.util.Locale;

/**
 * java字符串就是unicode字符序列
 * java没有内置的字符串类型，在标准java类库中提供了预定义的String类。
 */
public class StringsDemo {

    public static void main(String[] args) {

        //每一个用双引号括起来的字符串都是String类的实例
        String e = ""; //空字符串
        String greeting = "Hello";

        //子串 Substrings
        String s = greeting.substring(0, 3);
        System.out.println(s); //Hel  长度 = 3 - 0

        //拼接  Concatenation
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13; //字符串拼接
        System.out.println(message);

        int age = 13;
        String rating = "PG" + age; //字符串与非字符串拼接，通常用于输出语句中
        System.out.println(rating);

        boolean answer = true;
        System.out.println("The answer is " + answer);

        //String类没有提供修改字符串的方法，因此String类对象称为不可变字符串

        //编译器可以让字符串共享来提高效率，往往我们只需要比较字符串而不是修改字符串
        greeting = greeting.substring(0, 3) + "p!"; //通过拼接创建新的字符串来达到修改字符串的目的
        System.out.println(greeting);

        System.out.println("-------------------------");

        //检测字符串内容是否相同、是否相等，使用equals方法

        String s1 = "Hello";
        System.out.println(s1.equals("Hello")); //true

        //检测字符串相等，不区分大小写。
        String s2 = "Hello";
        System.out.println(s2.equalsIgnoreCase("hello")); //true


        //不可以使用 == 判断字符串相等

        //如果两个字符串被放置在同一存储空间，固然==判断出相等。但是相同的字符串未必都放置在同一位置。

        String s3 = "Help";
        if (s3 == "Help") {
            System.out.println("true");
        }

        //实际上只有字符串常量是共享的，而"+"和substring等操作产生的结果就是不共享的
        if ((s3.substring(0, 3) + "p") == s3) {
            System.out.println("true");
        }

        System.out.println("-------------------------");

        //空字符串：串长度为0，内容为空，是一个具体的java对象，占据内存空间
        //判断一个字符串是空字符串
        String empstr = "";

        if (empstr.length() == 0) {
            System.out.println("该字符串是空字符串");
        }

        if (empstr.equals("")) {
            System.out.println("该字符串是空字符串");
        }

        //String变量可以存储一个特殊值null，这代表String变量不存储任何有效地址，不指向任何存储空间，不引用任何字符串对象。
        //该String变量不可以调用任何方法。

        String nullstr = null;
        if (nullstr == null) {
            System.out.println("该字符串为null");
        }

        //判断字符串对象非null且非空，注意要先判断非null

        String good = "good";
        if (good != null && good.length() != 0) {
            System.out.println("该字符串非null且非空");
        }

        System.out.println("-------------------------");

        //代码点Code Points 和 代码单元 Code Units
        //java字符串由char序列组成，char数据类型就是一个采用utf-16编码表示unicode代码点的代码单元
        //大多数的常用Unicode字符使用一个代码单元即可，而辅助字符需要使用一对代码单元表示

        //length方法：返回采用utf-16编码表示的给定字符串所需要的代码单元数量
        String str = "𝕫 is the set of integers.";
        int n = str.length();  //代码单元个数，不代表实际的字符串包含的unicode字符的个数，也就是代码点的个数
        System.out.println(n); //26

        //代码点的个数
        int cpCount = str.codePointCount(0, str.length());
        System.out.println(cpCount); //25

        //遍历字符串所有代码单元
        for (int i = 0; i < str.length(); i++) {
            System.out.print("\\u" + Integer.toHexString((int) str.charAt(i)).toUpperCase() + " ");
        }

        System.out.println("\n-------------------------");

        //遍历字符串的所有代码点
        for (int i = 0; i < cpCount; i++) {
            int index = str.offsetByCodePoints(0, i);
            int cp = str.codePointAt(index);
            System.out.print("\\u" + Integer.toHexString(cp).toUpperCase() + " ");
        }

        System.out.println("\n-------------------------");

        //遍历字符串的所有代码点之二  正序
        for (int i = 0; i < str.length(); ) {
            int cp = str.codePointAt(i);
            if (Character.isSupplementaryCodePoint(cp))
                i += 2;
            else i++;
            System.out.print("\\u" + Integer.toHexString(cp).toUpperCase() + " ");
        }

        System.out.println("\n-------------------------");

        //遍历字符串的所有代码点之二  倒序
        for (int i = str.length(); i > 0; ) {
            i--;
            if (Character.isSurrogate(str.charAt(i))) i--;
            int cp = str.codePointAt(i);
            System.out.print("\\u" + Integer.toHexString(cp).toUpperCase() + " ");
        }
    }
}
