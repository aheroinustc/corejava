package v1ch03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 使用Arrays类中的sort方法进行排序
 * 这个方法使用了优化的快速排序算法
 * 排序后然后进行查找，使用binarySearch
 *
 */
public class ArraySortDemo {
    public static void main(String[] args) {
        //数组排序的演示
        //从1-n里面随机抽取k个不重复的数值。
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? "); //例如 6
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");//例如 49
        int n = in.nextInt();

        //用1 2 3 . . . n填充数组
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        //存放抽取出来的随机值
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            // make a random index between 0 and n - 1
            int r = (int) (Math.random() * n);

            // pick the element at the random location
            result[i] = numbers[r];

            // move the last element into the random location
            numbers[r] = numbers[n - 1];
            n--;
        }

        // 使用快速排序法进行排序
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result)
            System.out.println(r);

        //二分查找
        int[] arr = {23,1,45,3,2,-4,45,5,9,3} ;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr,4);
        System.out.println(index); //-6  = - (insertion point) - 1
    }
}
