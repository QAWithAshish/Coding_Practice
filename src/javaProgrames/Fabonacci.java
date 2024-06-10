package javaProgrames;

import java.util.Scanner;

class Fibonacci {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        printFibonacci(num);

    }

    public static void printFibonacci(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series till " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
          System.out.print(firstTerm + ", ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}