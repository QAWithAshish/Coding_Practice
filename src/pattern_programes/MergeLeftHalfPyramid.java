package pattern_programes;

import java.util.Scanner;

public class MergeLeftHalfPyramid {

    /*              *
                   **
                  ***
                 ****
                  ***
                   **
                    *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :: ");
        int num = sc.nextInt();

        printMergeLeftHalfPyramid(num);
    }

    public static void printMergeLeftHalfPyramid(int num){

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = 1; i <= num - 1; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = num - 1; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
