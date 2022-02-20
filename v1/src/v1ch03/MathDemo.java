package v1ch03;
import static java.lang.Math.*; //静态导入

//静态方法
public class MathDemo {

	public static void main(String[] args) {

		double  a = sqrt(4);
		System.out.println(a);

		double x = 3 ;
		System.out.println(pow(a, x));

		System.out.println("The square root of \u03C0 is " + sqrt(PI));
		System.out.println(Math.PI);
		System.out.println(E);
	}
}
