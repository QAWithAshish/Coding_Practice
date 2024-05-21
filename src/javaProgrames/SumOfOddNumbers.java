package javaProgrames;

import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner inpuScanner = new Scanner(System.in);

        System.out.println("Please Enter your numbers ");
        int number = inpuScanner.nextInt();
        int sum = sumOfOddNumberIs(number);
        System.out.print("Odd Sum Till " +number + " is: "+ sum);
    }

    public static int sumOfOddNumberIs(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;

        }

       /* for(int i=1; i<=num;i+=2){
            sum += i;
        }*/

        return sum;
    }

}
