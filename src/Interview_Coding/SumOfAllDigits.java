package Interview_Coding;

import java.util.Scanner;

public class SumOfAllDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = sumOfDigits(number);

        System.out.println("The sum of all digits of " + number + " is: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  // Extract the last digit and add it to sum
            num /= 10;        // Remove the last digit from the number
        }
        return sum;
    }
}
