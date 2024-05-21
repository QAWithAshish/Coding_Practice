package javaProgrames;

import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter value");
		int n=sc.nextInt();
		int t=0;
		while(n!=0)
		{ 
			int temp=n%10;
			t+=temp*temp*temp;
		    n=n/10;
			
		}
		System.out.println(t);
		
	}

}
