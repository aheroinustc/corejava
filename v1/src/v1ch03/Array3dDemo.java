package v1ch03;

import java.util.Arrays;
import java.util.Random;

public class Array3dDemo {
    public static void main(String[] args) {
        int[][][] arr3d = new int[3][][] ;

        /*
         1. 定义栈区的 int[][][]类的引用 arr3d，并指向堆区的 int[][][]类的对象.
         2. 类比一维数组，这片堆区包含3个变量，初值为null，均是int[][]类的引用，可以用arr3d[0-2]来标记.
         3. 每个int[][]类的引用所指向的int[][]类的对象的行、列长度可以都不指定，也可以只指定行长度。
         4. 对于每个int[][]类的引用，按照二维数组的方法降解，此处不再赘述。
         5. 对象数组和基本类型数组都是扩展于object类 
         */

        System.out.println(arr3d instanceof int[][][]);

        System.out.println(arr3d[0]);  //null
        System.out.println(arr3d[1]);  //null
        System.out.println(arr3d[2]);  //null

        System.out.println("-------------------");
        //随机赋值，体会三维数组的实现细节
        Random rd  = new Random();

        for (int i = 0 ; i < arr3d.length;i++) {
            arr3d[i] = new int[rd.nextInt(2) + 1][];
            for (int j = 0; j < arr3d[i].length; j++) {
                arr3d[i][j] = new int[rd.nextInt(3) + 1];
                for (int k = 0; k < arr3d[i][j].length ; k++) {
                    arr3d[i][j][k] = rd.nextInt(100) ;
                    System.out.print(arr3d[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println("-------------------");
        }

        //使用静态方法简单打印三维数组
        System.out.println(Arrays.deepToString(arr3d));

            //三维数组的求和
        int sumd = 0 , sum2d = 0, sum3d = 0;

        for (int [][] arr2d:arr3d) {
            sum2d = 0;
            for (int[] arrd:arr2d) {
                sumd = 0;
                for (int a: arrd) {
                    sumd+= a ;
                }
                sum2d+= sumd;
            }
            System.out.println("sum2d = " + sum2d);
            sum3d += sum2d;
        }
        System.out.println("sum3d = " + sum3d);
    }

}
