package Interview_Coding;

import java.util.Scanner;

public class FactorialOfNumber {
    static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number :: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is "
                + factorial(num));
    }
}
