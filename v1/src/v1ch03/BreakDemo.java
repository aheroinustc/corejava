package v1ch03;

//演示break语句的作用
//break除了可以用在switch语句，还用在循环语句

public class BreakDemo {

    public static void main(String[] args) {
    	
    	/* break在循环中的作用 */
        func();
        funcBreak();
        funcBreakWithLabel();
         
    }

   /* 打印原始版本的九九乘法表*/
    protected   static void func() {
        int i ,j ;
        System.out.println("-------------原始版本的99乘法表------------");

        for (i = 1;i <= 9 ;i++) {
            for(j = 1;j <= i;j++) {
                System.out.print(j + "*" + i + "=" + ( i * j ) + "\t");
            }
            System.out.println();
        }
    }

    /*使用了break关键字的99乘法表*/
    private static void funcBreak(){
        int i ,j ;

        System.out.println("------使用了break关键字的99乘法表------------");
        for (i = 1;i <= 9 ;i++) {
            for(j = 1;j <= i;j++) {
                if(i == j) {
                	System.out.print("######\t");
                	break;
                }
                // 当break语句出现在嵌套循环中的内层循环时，它只能跳出内层循环,外层循环继续执行。
                System.out.print(j + "*" + i + "=" + ( i * j ) + "\t");
            }
            System.out.println();
        }
    }
    
    /*使用了带标签的break语句*/
    private static void funcBreakWithLabel(){
        // 如果想使用break语句跳出外层循环则需要对外层循环添加标记。
        int i ,j ;
        System.out.println("------使用了break关键字和标签的99乘法表------------");
        
        out:
        for (i = 1;i <= 9 ;i++) {
            for(j = 1;j <= i;j++) {
                if(i * j == 35) break out;
                System.out.print(j + "*" + i + "=" + (i*j)+ "\t");
            }
            System.out.println();
        }
    }

}
