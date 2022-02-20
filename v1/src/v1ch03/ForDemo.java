package v1ch03;

import java.util.Scanner;

/**
 * for循环是while循环的简化形式
 */
public class ForDemo {
    public static void main(String[] args) {

        //演示中奖概率：从1到n之间取出k个数字
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt(); //例如 6

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt(); //例如 50

        /*
         * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!"); // 概率1/15890700
    }

}
