package pattern_programes;

import java.util.Scanner;

public class ReverseLeftHalfPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :: ");
        int num = sc.nextInt();
        printReverseLeftHalfPyramid(num);
    }

    public static void printReverseLeftHalfPyramid(int num) {

        for (int i = 1; i <= num; i++) {

            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=num;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
