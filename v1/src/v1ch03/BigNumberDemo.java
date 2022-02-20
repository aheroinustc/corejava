package v1ch03;

/**
 * 如果基本的整数、浮点数类型精度不能满足需求，则可以使用如下两个类
 * 这两个类可以处理包含任意长度数字序列的数值
 * BigInteger实现任意精度的整数运算
 * BigDecimal实现任意精度的浮点运算
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigNumberDemo {

    public static void main(String[] args) {

        //使用静态方法将普通的数值转换成大数值，不能使用普通的四则运算符处理大数值
        //java没有提供运算符重载功能，只为字符串的"+"提供了。
        BigInteger a = BigInteger.valueOf(9_876_543_210L);
        BigInteger b = BigInteger.valueOf(1_234_567_890L);

        //大整数的加法、乘法
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        //大浮点数的减法、除法
        BigDecimal x = BigDecimal.valueOf(9999.2345);
        BigDecimal y = BigDecimal.valueOf(3333.1234);
        System.out.println(x.subtract(y));
        System.out.println(x.divide(y, RoundingMode.HALF_UP)); //四舍五入，必须给出舍入方式

        /**
         * 中奖的概率，从1-490中取出60个值中奖概率演示
         */

        int k = 60;
        int n = 490;
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        /*
         * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(
                    BigInteger.valueOf(i));

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

        /**
         * 大浮点数可以进行大小比较，相等比较
         */
        BigDecimal z1 = BigDecimal.valueOf(3.1415926535897932384626433832795); //由于double类型的精度限制，转换后为相同的大浮点数
        BigDecimal z2 = BigDecimal.valueOf(3.141592653589793238);
        System.out.println(z1);

        System.out.println(z1.compareTo(z2) == 0 ? "z1等于z2" : "z1不等于z2");
    }
}
