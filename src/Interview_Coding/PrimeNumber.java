package Interview_Coding;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :: ");
        int num = sc.nextInt();
        isNumberIsPrime(num);

    }

    public static void isNumberIsPrime(int num) {
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println("is a prime number");
            } else {
                System.out.println("Not a prime number ");
            }
        } else {
            System.out.println("Not a prime number ");
        }
    }
}
