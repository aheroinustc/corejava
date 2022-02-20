package v1ch03;

/**
 * 条件语句：
 * if - else
 * else子句与最邻近的if构成一组
 */
public class IfDemo {
    public static void main(String[] args) {

        //演示1：判断数字的正负
        int i = 3;
        int sign = 0;
        if (i <= 0)
            if (i == 0) sign = 0;
            else sign = -1;
        else sign = 1;
        System.out.println(sign);

        //演示2：销售业绩评价
        double target = 10000.00;
        double yourSales = 15001.00;
        double bonus = 0;
        String performance = "";

        if (yourSales >= 2 * target) {
            performance = "Excellent!";
            bonus = 1000;
        } else if (yourSales >= 1.5 * target) {
            performance = "Fine";
            bonus = 500;
        } else if (yourSales >= target) {
            performance = "Satisfactory!";
            bonus = 100;
        } else {
            System.out.println("You are fired!");
        }

        System.out.println("----------------------------");

        //演示3：找出两个数中的最大值
        int a1 = 11;
        int a2 = 21;
        int max2 = a1;
        if (a2 > a1) {
            max2 = a2;
        }

        System.out.printf("max2(%d,%d) = %d\n", a1, a2, max2);
        System.out.println("max2 = " + (a1 > a2 ? a1 : a2));


        //演示4：找出三个数中的最大值
        int a = 2, b = 4, c = 4;
        int max3 = 0;
        if (b > a)
            max3 = b;
        else if (c > a)
            max3 = c;
        else
            max3 = a;

        System.out.printf("max3(%d,%d,%d) = %d\n", a, b, c, max3);
        System.out.println("max3 = " + ((a > b ? a : b) > c ? (a > b ? a : b) : c));

    }
}
