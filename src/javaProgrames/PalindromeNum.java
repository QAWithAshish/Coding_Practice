package javaProgrames;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		
		int num=sc.nextInt();
		
		int orgNum=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10 +num%10;
			num=num/10;
			
		}
		if(orgNum==rev) {
			System.out.println(orgNum +": Palindrome Number");
		}else {
			System.out.println(orgNum +": Not a Palindrome Number");
		}
	}

}
