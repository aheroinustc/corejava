package v1ch03;

/*
  continue语句用在循环语句中，它的作用不是跳出本层循环，
  而是提前结束本层循环的本次循环，执行本层循环的下一次循环。
*/

public class ContinueDemo {
    public static void main(String[] args) {
    	ContinueInWhile();
    	ContinueInFor();
    }

    
    /*
     continue语句用在while循环语句中，可以跳到条件判断部分
   */
    private static  void ContinueInWhile(){
    	int sum = 0, sumOdd = 0 ,sumEven = 0;
    	//sum , 用于记总和。
        // sumOdd，用于记奇数和。
        //sumEven,用于记偶数和。
    	int k = 0; 	
    	while(++k <= 10){
    		sum += k; //计算总和
    		
            if (0 != (k % 2)) {  
            	sumOdd += k; //计算奇数和
                continue;
            }
            sumEven += k;   //计算偶数和 
    	}
    	System.out.println("sum = "+ sum +"\n" + "sumOdd = " + sumOdd + "\n" + "sumEven = " + sumEven); 
    }
    
    
    /*
    continue语句用在for循环语句中，可以跳到“更新”部分
   */
    private  static void ContinueInFor(){
        int sum = 0, sumOdd = 0 ,sumEven = 0;

        //sum , 用于记总和。
        // sumOdd，用于记奇数和。
        //sumEven,用于记偶数和。

        for (int k = 1; k <= 10 ; k++) {

            sum += k ;

            if (0 != (k % 2)) {
                sumOdd += k;
                continue;  // 结束本次循环,跳到k++
            }
            sumEven += k;
        }
        System.out.println("sum = "+ sum +"\n" + "sumOdd = " + sumOdd + "\n" + "sumEven = " + sumEven);
    }
}
