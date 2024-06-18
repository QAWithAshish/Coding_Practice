package array.interviewQuestions;

import java.util.Arrays;

public class CompareTwoArrays {


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 3, 5};
        int[] arr2 = {5, 2, 4, 1, 3};

        if(isArraysEquals(arr1, arr2)) {
            System.out.println("Both array are equals ");
        }else{
            System.out.println("Both array are not equals ");
        }
    }

    public static boolean isArraysEquals(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Method 1
         return Arrays.equals(arr1, arr2);

        // Method 2
        /*
        for(int i=0;i< arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
        */


    }
}
