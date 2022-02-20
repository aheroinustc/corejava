/**
 * Java是一种强类型语言。
 * 共有8种基本类型(primitive types):
 * <p>
 * 4种整型(integer type)
 * 2种浮点型(floating-point number type)
 * 1种字符类型(character type)
 * 1种布尔类型(boolean type)
 * <p>
 * Java的所有数值类型(numeric types)所占的字节数量是平台独立的(platform-independent)
 * Java没有任何无符号类型(unsigned types)
 */
package v1ch03;

/**
 * @author Richard Lee
 *
 */
public class DataTypeDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //boolean: true or false .
        boolean bl = true;
        if (bl == true) {
            System.out.println("Hi boolean!");
        }

        //byte: The byte data type is an 8-bit signed two’s complement integer.	Value: -128 to 127.
        byte a = 126;
        System.out.println(a);

        a++;
        System.out.println(a); //127，最大值

        a++;
        System.out.println(a);//-128 ,溢出

        a++;
        System.out.println(a); //-127

        System.out.println(Byte.MAX_VALUE);//查看最大值
        System.out.println(Byte.MIN_VALUE);//查看最小值


        //short: The short data type is a 16-bit signed two’s complement integer.  Value: -32,768 to 32,767
        System.out.println(Short.MAX_VALUE);//查看最大值
        System.out.println(Short.MIN_VALUE);//查看最小值


        //int: It is a 32-bit signed two’s complement integer.  Value: -2^31 to 2^31 - 1

        int b = 0b1111_0100_0010_0100_0000; //二进制
        int c = 0xCAFE; //16进制
        int d = 0123_456; //8进制
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(Integer.MAX_VALUE);//查看最大值
        System.out.println(Integer.MIN_VALUE);//查看最小值

        //long: The long data type is a 64-bit two’s complement integer. Value: -2^63 to 2^63-1.

        long l = 2_147_483_648L; //you can add underscores to number literals for human eyes
        System.out.println(l);
        System.out.println(Long.MAX_VALUE);//查看最大值
        System.out.println(Long.MIN_VALUE);//查看最小值


        //Floating point Numbers : float and double.
        //Floating-point numbers are not suitable for financial calculations,可以 use the BigDecimal class替代
			   /*
			     
			    float:  4 bytes. 6-7 significant decimal digits   
			            The float data type is a single-precision 32-bit IEEE 754 floating point. 
			    double: 8 bytes. 15 significant decimal digits 
			            The double data type is a double-precision 64-bit IEEE 754 floating point. 
			    		For decimal values, double data type is generally the default choice.
			   */

        float f = (float) 3.14;
        f = 3.143F;
        double dd = 3.14; //也可以使用3.14D,缺省就是double
        System.out.println(f);
        System.out.println(dd);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Float.SIZE);
        System.out.println(Double.SIZE);

        //三个特殊的浮点值：正无穷、负无穷、NaN
        double nan = 0.0 / 0;
        System.out.println(0.0 / 0);//NaN
        System.out.println(nan == Double.NaN); //always false
        System.out.println(Double.isNaN(nan)); //true

        double pinfinite = -1.0 / 0;
        System.out.println(pinfinite == Double.NEGATIVE_INFINITY); //always true
        System.out.println(Double.isInfinite(pinfinite));
    }

}
