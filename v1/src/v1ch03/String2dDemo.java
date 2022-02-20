package v1ch03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class String2dDemo {
	public static void main(String[] args) {
		String[][] strstr = new String[3][];
		
		System.out.println(strstr instanceof String[][]); //true
		
		System.out.println(strstr[0]);
		System.out.println(strstr[1]);
		System.out.println(strstr[2]); //null
		
		Random rd  = new Random();
		Scanner sc= new Scanner(System.in);
		
		for(int i = 0; i < strstr.length;i++) {
			strstr[i] = new String[rd.nextInt(3) + 1];
			System.out.println("请输入strstr[" + i +"]字符串数组：");
			for(int j = 0; j < strstr[i].length;j++) {
				strstr[i][j] = sc.nextLine();
			}
		}
		sc.close();
	
		System.out.println(Arrays.deepToString(strstr));
	}
}
