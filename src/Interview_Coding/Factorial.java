package Interview_Coding;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate factorial
        int factorial = calculateFactorial(number);

        // Print the result
        System.out.println("Factorial of " + number + " is: " + factorial);
        System.out.print(number + "! = ");

        // Print the factorial calculation process
        for (int i = number; i > 0; i--) {
            if (i != 1) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i + " = " + factorial);
            }
        }

        scanner.close();
    }

    // Method to calculate factorial
    public static int calculateFactorial(int num) {
        int result = 1;
        for (int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
