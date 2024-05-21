package javaProgrames;

import java.util.Scanner;

public class Swap_WithoutAnyVariable {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter value of a :: ");
        int a=sc.nextInt();

        System.out.print("Enter value of b :: ");
        int b=sc.nextInt();

        System.out.println("Before swap Value of a is "+a + " and b is " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap Value of a is "+a + " and b is " +b);


    }
}
