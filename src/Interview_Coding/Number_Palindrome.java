package Interview_Coding;

import java.util.Scanner;

public class Number_Palindrome {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number :: ");
        int num=sc.nextInt();
        int rev=0,rem,temp=num;

        while(num>0){
            rem=num%10;
            num=num/10;
            rev=(rev*10)+rem;
        }
        System.out.println("Reverse of the number :: "+rev);
        if(temp==rev){
            System.out.println("Number is palindrome ");
        }else{
            System.out.println("Number is not a palindrome ");
        }
    }
}
