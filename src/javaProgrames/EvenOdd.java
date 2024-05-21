package javaProgrames;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Number :");
		int num = sc.nextInt();

		sc.close();
		if (num % 2 == 0) {

			System.out.println("Given number is Even :" + num);
		} else {
			System.out.println("Given number is Odd :" + num);

		}
	}
}
