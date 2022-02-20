package v1ch03;

public class OperatorsDemo {

    public static void main(String[] args) {

        //算术运算符：arithmetic operators  + - * / %   += -=  *= /=  %=
        //整数被0除为异常，浮点数被0除为NaN或正负无穷大
        System.out.println(3 / 2);
        System.out.println(3.0 / 2);
        System.out.println(15 % 2);

        System.out.println("---------------");

        //自增自减运算符：Increment and Decrement Operators  ++  --
        int i = 1;
        System.out.println(++i);//2 先运算再取值
        System.out.println(i--); //2 先取值再运算
        System.out.println(i); //1

        System.out.println("---------------");

        //关系运算符和布尔运算符：Relational and boolean Operators  == !=  >= <= > <  && || !  ?:
        System.out.println(3 > 2); //true
        System.out.println(23 != 32); //true

        System.out.println((3 < 2) && ((i = 4) > 3));//false, &&和||具有短路特性
        System.out.println(i); //1

        System.out.println("---------------");

        //位运算符：Bitwise Operators   与&  或|   异或^   非~   << >> >>>
        //仅限整型或者布尔型数据

        //获取32bit二进制位右起第四位数字
        int fourthBitFromRight = (-1 & 0b1000) / 0b1000; // (FFFF FFFF & 0000 0008 )
        System.out.println(fourthBitFromRight); //1

        //& |应用于布尔值,与&& ||类似，返回布尔值，但是无短路特性
        int a = 1;
        System.out.println((2 < 3) || (++a == 2)); //true
        System.out.println(a); //1

        System.out.println((2 < 3) | (++a == 2)); //true
        System.out.println(a); //2

        System.out.println("---------------");

        //对于 << >>  >>>运算符，
        //当左边参数为byte/short/int类型时，移位参数需要对32进行模运算，再获取实际移位次数0-31。返回值为int类型
        //当左边参数为long类型，移位参数需要对64进行模运算，再获取实际移位次数0-63。返回值为long类型


        //获取32bit二进制位右起第四位数字1/0的第二种方法
        int fourthBitFromRight2 = (-1 & (1 << 3)) >> 3;
        System.out.println(fourthBitFromRight2);

        //>> which extends the sign bit into the top bits 这叫算术移位
        int b = -12; // FFFF FFF4
        System.out.println(b >> 2); //FFFF FFFD  -3 这里右边参数2为int，就按32的模运算来移位。

        // >>> operator fills the top bits with zero,这叫逻辑移位。。不存在<<<运算符
        int c = -12;
        System.out.println(c >>> 2); // 3FFF FFFD


        System.out.println(1 << 31); //-2147483648

        System.out.println(1 << 32); //1    移动0次
        System.out.println(1L << 32); //4294967296   移动32次

    }

}
