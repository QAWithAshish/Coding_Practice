package pattern_programes;

import java.util.Scanner;

public class Pyramid {
/*
               *
              ***
             *****
            *******
           *********

 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :: ");
        int num = sc.nextInt();
        //printPyramid(num);
        printWithThreeForLoop(num);
    }
    public static void printPyramid(int num){

        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printWithThreeForLoop(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <(i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
