package practic;

import java.util.Scanner;

public class SumOfAllDigits {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number ::");
       int num = sc.nextInt();
        getSumOfAllDigits(num);

    }

    public static void getSumOfAllDigits(int num){
        int sum=0;
        while(num != 0){
            sum +=num%10;
            num /= 10;
        }
        System.out.println("Sum of all digits is :: "+sum);
    }
}
