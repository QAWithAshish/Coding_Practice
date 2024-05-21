package javaProgrames;

import java.util.Scanner;

public class Multiplication_Table {

    //WAP to print multiplication table of any number from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :: ");
        int number = input.nextInt();

        printMultiplicationTable(number);
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + i * number);
        }
    }
}
