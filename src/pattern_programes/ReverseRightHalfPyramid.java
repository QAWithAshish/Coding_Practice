package pattern_programes;

import java.util.Scanner;

public class ReverseRightHalfPyramid {

    /*
         * * * *
         * * *
         * *
         *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :: ");
        int num = sc.nextInt();
        printReverseRightHalfPyramid(num);
    }

    public static void printReverseRightHalfPyramid(int num) {

        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
