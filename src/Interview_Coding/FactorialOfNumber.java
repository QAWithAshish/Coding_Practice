package Interview_Coding;

import java.util.Scanner;

public class FactorialOfNumber {
    static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    //Using ternary operator

  /*  public static int factorial(int n)
    {

        // single line to find factorial
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number :: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is "
                + factorial(num));

    }
}
