package v1ch03;

/**
 * switch语句提供多重选择，以补足if-else语句
 *
 *从匹配的case标签进入，一直执行到遇到break语句或者到switch语句结束为止。
 *如果无匹配标签，则从default子句进入。
 *
 * 有可能触发多个case分支，一定要在每个case分支后加break以避免错误。
 * 可以在编译时添加javac -Xlint:fallthrough选项，这样会有缺失break的警告信息
 *
 */

import java.util.Scanner;

enum Day { 
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY
}  ;

public class SwitchDemo {

	public static void main(String[] args) {
		//case标签可以是char\byte\short\int包括其包装器类(Character/Byte/Integer/Short)的常量表达式
		//case标签可以是枚举常量
		//从java SE 7开始也可以是字符串字面量

		//演示1：判断日子好坏
		Day day = Day.FRIDAY;
		switch (day) 
		{ 
			case MONDAY: 
				System.out.println("Mondays are bad.");break;
			case FRIDAY: 
				System.out.println("Fridays are better.");break;
			case SATURDAY: 
			case SUNDAY: 
				System.out.println("Weekends are best.");break;
			default: 
				System.out.println("Midweek days are so-so.");break;
		}


		//演示2：学生成绩
		Scanner sc = new Scanner(System.in);   
		System.out.println("请输入学生成绩以判断等级:");

		int studentScore = sc.nextInt();

		System.out.println("您输入的学生成绩为:" + studentScore);

		
		//使用if-else语句判断等级
		char c ;
		if (studentScore >= 90) 
			c = 'A';
		else if (studentScore >= 80) 
			c = 'B';
		else if (studentScore >= 70) 
			c = 'C';
		else if (studentScore >= 60) 
			c = 'D';
		else 
			c = 'E';

		//使用switch打印等级
		switch (c) {
		case 'A':
			System.out.println("成绩等级为A");
			break;
		case 'B':
			System.out.println("成绩等级为B");
			break;
		case 'C':
			System.out.println("成绩等级为C");
			break;
		case 'D':
			System.out.println("成绩等级为D");
			break;
		case 'E':
			System.out.println("成绩等级为E");
			break;

		}
		
		sc.close();

	}
}

