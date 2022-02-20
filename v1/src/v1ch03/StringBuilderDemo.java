package v1ch03;

//字符串构建器 在处理许多较短的字符串时，构建新字符串的效率比String的连接操作高
public class StringBuilderDemo {

    public static void main(String[] args) {

        //构建一个空的string builder
        StringBuilder builder = new StringBuilder();

        //调用append方法添加新内容
        builder.append('a');// appends a single character
        builder.append(" abc ");//appends a string
        builder.append(3.1415926); //appends a double

        //调用toString方法生成String对象
        String completedString = builder.toString();
        System.out.println(completedString);

        //如果针对单线程，StringBuilder比StringBuffer效率要高，并优先使用。
        //但是，StringBuffer适用于多线程，是线程安全的。这两个类的api是相同的。

        //StringBuilder的重要的方法
        System.out.println(builder.length()); //returns the number of code units of the builder

        builder.setCharAt(0, 'h');
        System.out.println(builder); //sets the i th code unit to c

        builder.insert(0, "ppppp");
        System.out.println(builder);//inserts a string at position offset and returns this

        builder.delete(0, 5);
        System.out.println(builder);//deletes the code units with offsets startIndex to endIndex - 1 and returns this .


    }

}
