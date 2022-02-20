package v1ch03;

/**
 * 块即复合语句，是由一对花括号括起来的若干java语句
 * 使用块的好处是原本只能放置一条语句的地方可以放置多条语句
 * 块可以嵌套
 * 块确定了变量的作用域
 */
public class BlockScopeDemo {
    public static void main(String[] args) {
        int n = 1;
        {
            // int n = 2 ;  错误，n不能重复声明
            int k = 3;

        }
        // System.out.println(k);  错误，超出k的作用域
    }
}
