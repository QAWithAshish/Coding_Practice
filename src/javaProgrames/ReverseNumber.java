package javaProgrames;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your number = ");

		int num = sc.nextInt(); // 1234

		// 1 Using algorithm

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10; // 0
			num = num / 10;
		}

		/*
		 * // 2 using stringBuffer class
		 * 
		 * StringBuffer sb=new StringBuffer(String.valueOf(num)); 
		 * StringBuffer rev=sb.reverse();
		 * 
		 * 
		 * //3 Using StringBuilder class
		 * 
		 * StringBuilder sb=new StringBuilder(); sb.append(num); StringBuilder rev =
		 * sb.reverse();
		 * 
		 */
		System.out.println("Reverse Number is = " + rev);
		sc.close();
	}

}
