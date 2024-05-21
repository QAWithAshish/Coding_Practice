package javaProgrames;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enetr any year =");
		int year = sc.nextInt();
		sc.close();
		
		// Logic checking whether the year is Leap year or not
		boolean isLeapYear = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
			} else {
				isLeapYear = true;

			}
		} else {
			isLeapYear = false;
		}
		if (isLeapYear) {
			System.out.println("Given year " + year + " is a leap year");
		} else {
			System.out.println("Given year " + year + " 2is not a leap year");
		}
	}

}
