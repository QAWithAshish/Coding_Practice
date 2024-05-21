package javaProgrames;

import java.util.Scanner;

public class Calcualtor {

	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate the Sum of a nad b");

		System.out.print("Enetr the Values of A :");
	    int a = sc.nextInt();
		
	    System.out.print("Enetr the Values of B :");
		int b = sc.nextInt();
		
	
		System.out.print("Sum of "+a+" and "+b+ " is :"+ (a+b));
	}
}
