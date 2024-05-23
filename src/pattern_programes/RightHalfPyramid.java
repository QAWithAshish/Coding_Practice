package pattern_programes;

import java.util.Scanner;

public class RightHalfPyramid {

    /*        *
              * *
              * * *
              * * * *

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :: ");
        int num = sc.nextInt();

        //print Right Half Pyramid Pattern
        printRightHalfPyramid(num);
    }

    public static void printRightHalfPyramid(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
