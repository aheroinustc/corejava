package v1ch03;

/**
 * 数组(Array)是一种数据结构，用于存储同一类型值的集合，通过整型下标进行访问数值中的每一个值
 */

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        /**
         * 声明一个数组类型的变量
         *
         *
         *         1. int[] arr = null ;
         *                            定义1个“int[]类”（即一维int型数组） 的引用型变量,或者叫数组变量。
         *                            这个变量存储在栈区，变量初值为null。
         *                            当然int[]不是所谓的类，也没有所谓的int[]类的对象。
         *
         *         2. arr = new int[10] ;
         *                            在堆区创建一个长度为10的连续存储区， 作为数组的存储区，
         *                            同时使得arr指向该数组。
         *                            这片堆区可以存储10个int类型（基本数据类型）的变量，变量初值都为0。
         *                            用符号标记arr[0-9]来完全代表这些变量.
         *
         */
        int[] a; //推荐方法 ,这里a并未初始化，并不代表实际的数组
        // int a[] ;  //也可以这样声明一个数组变量，不推荐


        /**
         * 声明并创建了一个长度为10的整型数组，下标从0开始
         * 数组长度可以是常量或者变量
         * 数字数组所有元素默认初始化为0。
         * 如果是Boolean数组，则元素初始化为false。
         * 如果是Object数组，则元素初始化为null。
         */
        int[] array = new int[10];
        System.out.println(array instanceof  int[]); //true
        //利用循环给数组赋值
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        // array[10] = 10 ; 越界访问

        /**
         * 数组中元素的个数 - 数组的长度
         * array.length获得长度，不是类的属性
         * 可以改变数组中元素的值，但是不可以改变数组的长度
         */
        //利用循环打印数组数值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        /**
         *  基本类型数组和引用类型数组具有区别
         *  以String类型数组为例，
         *  names是字符串数组类型的变量，
         *  names[0] - names[9]代表10个字符串类型的引用，初始值为null，不指向任何有效的字符串对象
         */
        String[] names = new String[10];
        //可以为这些字符串类型的变量指定为空字符串
        for (int i = 0; i < names.length; i++) {
            names[i] = "";
        }

        /**
         * 使用for each循环遍历数组或者实现了Iterable接口的类对象
         * 这种方法不需要使用下标，
         * 如果需要操作下标可以使用传统的fori循环
         */
        for (int element : array) {
            System.out.println(element);
        }

        /**
         * 使用Arrays类中的toString静态方法可以更加方便的遍历数组元素，
         * 这个方法返回一个事先已经格式化的包含所有数组元素的字符串
         */
        System.out.println(Arrays.toString(array));


        /**
         * java提供了创建数组对象并且同时初始化的简单形式
         */
        int[] smallPrimes = {2, 3, 5, 7, 11, 13}; //不需要使用new

        //可以通过创建匿名数组，实现对原先数组的重新初始化，避免再次创建一个数组变量
        smallPrimes = new int[]{17, 19, 23, 29, 31, 37};

        /**
         * java允许数组长度为0, 即不包含任何元素 ,arr[0]为越界访问
         * 数组长度为 0不同于数组变量为null
         * 长度为0的数组对于编写返回值为数组的方法时非常有用
         */
        int[] arr = new int[0];

        /**
         * 数组的拷贝：
         * 这里演示基本数据类型的拷贝
         */

        //数组变量的拷贝, 两个变量引用同一个数组
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12;
        System.out.println(smallPrimes[5]); //12

        //将一个数组的值全部拷贝到一个新的数组中去
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        System.out.println(Arrays.toString(copiedLuckyNumbers));
        //还可以增加原数组的长度,对于数值元素的数组，多余的元素为0,如果是Boolean类型则为false。
        //还可以拷贝一部分数组
        luckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
        System.out.println(Arrays.toString(luckyNumbers));

        /**
         * java命令行参数
         * main(String[] args)
         * 在命令行参数中，程序名并没有存储在args数组中
         * 例如：
         * $ java Message -h hello  world
         *
         * Message程序名不是args[0]
         * args[0]为"-h"
         * args[1]为"hello"
         * args[2]为"world"
         */

    }

}
