package pattern_programes;

import java.util.Scanner;

public class LeftHalfPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :: ");
        int num = sc.nextInt();

        printLeftHalfPyramid(num);

    }
    public static void printLeftHalfPyramid(int num){

        for(int i=1;i<=num;i++){

            for(int j=num;j>=i;j--){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
