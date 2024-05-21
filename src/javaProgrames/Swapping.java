package javaProgrames;

public class Swapping {

	public static void main(String args[]) {

		int a = 20;
		int b = 40;

		System.out.println("Before swapping " + a + " " + b);
		// Logic-1 :using 3rd variable

		/*
		 * int temp=a; a=b; b=temp;
		 * 
		 * 
		 * // Logic-2 :Without using 3rd variable with + and -
		 * 
		 * a = a + b;// 20+40=60 b = a - b;// 60-40=20; a = a - b;// 60-20=40;
		 */
		// Logic-3 :Without using 3rd variable with * and /
		// here a & b values should not be zero

		a = a * b;// 20*40=800
		b = a / b;// 800/40=20;
		a = a / b;// 800/20=40;
		
		System.out.println("After swapping " + a + " " + b);
	}

}
