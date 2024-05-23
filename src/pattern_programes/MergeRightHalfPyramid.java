package pattern_programes;

import java.util.Scanner;

public class MergeRightHalfPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :: ");
        int num = sc.nextInt();
        printMergeRightHalfPyramid(num);

    }

    public static void printMergeRightHalfPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = num-1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
