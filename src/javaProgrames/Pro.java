package javaProgrames;

import java.util.Scanner;

public class Pro {

	public static void main(String[] args) {

		/*
		 * 1 1 1 1 
		 *   b b b 
		 *     3 3
		 *       d
		 * 
		 */

		Scanner sc = new Scanner(System.in); // takes input
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		int k=1;
		char l=97;
		for(int i=rows; i>=1; i--)
			{
			for(int j=rows; j>=1; j--)
			
				if(i>=j)
				{
					if(i%2==0)
					System.out.print(k+" ");
				else
					System.out.print(l+" ");
				} 
				else
					System.out.print("  ");
			    System.out.println();
			    k++;
			    l++;
			}
		

		sc.close();
	}

}
