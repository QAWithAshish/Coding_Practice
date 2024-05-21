package Interview_Coding;

import java.util.Scanner;

public class Reverse_Number {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number :: ");
        int num = sc.nextInt();
        int rev=0,rem;

        while (num>0){
            rem=num%10;
            num=num/10;
            rev=(rev*10)+rem;
        }
        System.out.println("Reverse of the given number is :: "+rev);
    }
}
