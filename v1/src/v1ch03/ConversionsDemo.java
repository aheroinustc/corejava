package v1ch03;

public class ConversionsDemo {

	public static void main(String[] args) {

		/*
		 合法的自动转换

		 不同数值类型遇到二元操作时，就会自动转换成相同类型进行计算，规则如下：

		 如果两个操作数中有一个是double类型，另一个就会转换成double类型；
		 否则，如果其中一个操作数是float类型，另一个操作数就会转换成float类型；
		 否则，如果其中一个操作数是long类型，另一个操作数就会转换成long类型；
		 否则，两个操作数都会转换成int类型。

		*/

		//以下四种无信息丢失，自动转换
		//1. byte->short->int->long
		byte b = 2 ;
		short s  = b ;
		int i = s ;
		long l = i ;
		System.out.println(b + " "+ s + " " + i + " " + l);
		
		//2. char->int
		char c = 'a' ;
		int sc = c;
		System.out.println(c + " " + sc );
		
		//3. int->double
		int id = 3;
		double d = id;
		System.out.println(id + " " + d);
		
		//4. float->double 
		float f = 3.14159f ;
		double df = f;
		System.out.println(f + " " + df);
		
		//以下可能存在信息丢失，自动转换

		//1. int -> float
		float fi = i ;
		System.out.println(fi);

		//2. long->double
		double ld = l;
		System.out.println(ld);
		//3. long->float
		float fl = l ;
       System.out.println(fl);		
       

       /*
         有时候也需要强制类型转换,可能会丢失信息，java允许这种转换，称为cast
        */
       double x = 9.997;
       int nx = (int) x;
       System.out.println(nx); //强制类型转换通过直接截断将浮点值转换成整数值
       
       nx = (int)Math.round(x); //使用round函数获得最接近的整数，返回long类型，通过强制类型转换由int类型变量接收
       System.out.println(nx); //10
       
       byte bi = (byte)300 ; //超范围高位截断，获得完全不同的值
       System.out.println(bi); //44
       
        //无法将布尔类型强制转换为数值类型 使用?:表达式替代
       boolean bl = true;
       System.out.println(bl? 1:0);
       
	}

}
