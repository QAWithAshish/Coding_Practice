package array;

import java.util.Scanner;

public class ArraySearching {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {12, 23, 1, 223, 45, 14, 234, 34, 76, 8, 99, 76, 100};

        System.out.print("Enter number you want to search ");
        int number = input.nextInt();
        boolean isFound = isFound(arr, number);
        if(isFound){
            System.out.println("Your number was found in array");
        }else{
            System.out.println("Your number was not found in array");
        }

    }

    public static boolean isFound(int[] arr, int number) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == number) {
                return true;
            }
            index++;
        }
        return false;
    }
}
