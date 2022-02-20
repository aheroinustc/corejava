package v1ch03;

import java.util.Arrays;
import java.util.Random;

/*
	演示二维数组
*/
public class Array2dDemo {
    public static void main(String[] args) {

        int[][] arr2d = new int[3][];
        /*
         1. 定义栈区的 int[][]类的数组变量 arr2d，并指向堆区的 int[][]类 的数组对象.（形象的说法）
         2. 类比一维数组，这片堆区包含3个变量，初值为null，均是int[]类的引用，可以用arr2d[0-2]来标记.
         3. 每个int[]类的引用所指向的int[]类的对象的长度可以不指定，也可以指定，支持列的不定长。
         4. 注意，arr2d指向的堆区并不是二维数组实际数据的存储区，这些数据需要另外在堆区申请。
         */

        System.out.println(arr2d instanceof int[][]); //true
        System.out.println(arr2d[0]);  //null
        System.out.println(arr2d[1]);  //null
        System.out.println(arr2d[2]);  //null

        //可以使用简化的形式在创建数组的同时进行初始化
        int[][] array2d = {{1}, {2, 3}, {4, 5, 6}};
        //利用匿名变量对数组重新初始化，行数一致，列不定长
        array2d = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //使用Arrays类的静态方法，简单打印二维数组
        System.out.println(Arrays.deepToString(array2d));

        //随机赋值，体会二维数组的实现细节
        System.out.println("-------随机生成的二维数组为---------");
        Random rd = new Random();
        for (int i = 0; i < arr2d.length; i++) {
            arr2d[i] = new int[rd.nextInt(10) + 1]; //使得arr2d[0-2]获得具体指向
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = rd.nextInt(100);
                System.out.print(arr2d[i][j] + "\t");
            }
            System.out.println();
        }

        //对生成的二维数组分行求和、求总和
        int sumrow = 0;
        int sum = 0;
        int rowindex = 0;
        for (int[] row : arr2d) {
            rowindex++;
            sumrow = 0;
            for (int a : row) {
                sumrow += a;
            }
            sum += sumrow;
            System.out.printf("第%d行的和为: %d\n" ,rowindex, sumrow);
        }
        System.out.println("总和为: " + sum);
    }
}