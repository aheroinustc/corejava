package v1ch03;

/* The Unicode Standard has since been changed to allow for characters whose representation requires
 * more than 16 bits.
 * 
 * The range of legal code points(代码点) is now U+0000 to U+10FFFF, known as Unicode scalar value.
 * 
 * The set of characters from U+0000 to U+FFFF is sometimes referred to as the Basic Multilingual Plane (BMP). 
 * 
 * Characters whose code points are greater than U+FFFF are called supplementary characters.
 * 
 * The char data type is a single 16-bit Unicode character. 
 * 
 * The Java platform uses the UTF-16 representation in char arrays and in the String and StringBuffer classes. 
 * In this representation, supplementary characters are represented as a pair of char values,
 * the first from the high-surrogates range, (\uD800-\uDBFF), 
 * the second from the low-surrogates range (\uDC00-\uDFFF). 
 * 
 * A char value, therefore, represents BasicMultilingual Plane (BMP) code points, 
 * including the surrogate code points, or code units of the UTF-16 encoding.
 * 
 * An int value represents all Unicode code points,including supplementary code points. 
 * The lower (least significant)21 bits of int are used to represent Unicode code points and the upper (most significant) 11 bits must be zero. 
 * 
 * 
 * The methods that only accept a char value cannot support supplementary characters. 
 * They treat char values from the surrogate ranges as undefined characters. 
 * For example, Character.isLetter('\uD840') returns false, even though this specific value if followed by any low-surrogate value in a string would represent a letter. 
  
   The methods that accept an int value support all Unicode characters, including supplementary characters. 
   For example, Character.isLetter(0x2F81A) returns true because the code point value represents a letter. 

 * */
public class CharDemo {

    public static void main(String[] args) {

        //直接赋值
        char c1 = 'A';
        System.out.println("c1 = " + c1);


        //一般的转义表示
        char c2 = '\u0041';
        System.out.println("c2 = " + c2);

        char c3 = '\u2122';
        System.out.println(c3);

        //特殊的转义字符
        char c4 = '\"';
        System.out.println(c4);

        char c5 = '\'';
        System.out.println(c5);

        char c6 = '\\';
        System.out.println(c6);


        //采用字符串存储BMP之外的字符
        String str = "𝕫 is the set of integers.";
        System.out.println(str);
        System.out.println(str.length()); //总计26 = 2+1+2+1+3+1+3+1+2+1+8+1 个code units,𝕫占据两个代码单元。
        System.out.println(str.codePointCount(0, str.length()));//25个代码点code points.

        char first = str.charAt(0);
        char snd = str.charAt(1);
        System.out.printf("\\u%X", first + 0);//str的第一个代码单元
        System.out.printf("\\u%X\n", snd + 0);//str的第二个代码单元
        System.out.printf("U+%X\n", str.codePointAt(0));//str的第一个代码点


        String str1 = "\uD835\uDD6B is the set of integers.";
        System.out.println(str1);

        //以下详见Character类
        System.out.printf("U+%X\n", Character.MAX_CODE_POINT);//U+10FFFF 最大unicode代码点，27bits. MIN_CODE_POINT is U+0000.

        System.out.printf("\\u%X\n", Character.MAX_HIGH_SURROGATE + 0);  // \uDBFF
        System.out.printf("\\u%X\n", Character.MIN_HIGH_SURROGATE + 0);  //  \uD800

        System.out.printf("\\u%X\n", Character.MAX_LOW_SURROGATE + 0);  //  \uDFFF
        System.out.printf("\\u%X\n", Character.MIN_LOW_SURROGATE + 0);  //  \uDC00


    }

}
