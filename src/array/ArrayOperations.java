package array;

import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {

        //Insertion:
        // Inserting a value into an array typically involves assigning a value to a specific index.
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 20;
        arr[2] = 24;
        arr[3] = 23;
        arr[4] = 56;
        System.out.println("Insertion "+ Arrays.toString(arr));


        //Deletion:
        //Deletion can be simulated by shifting elements to the left, overwriting the value to be deleted,
        // and reducing the array size logically.
        int[] arr1 = {1, 23, 4, 67, 234, 42};
        int deleteIndex = 1;

        System.out.println("Before removing array from index 1 : "+Arrays.toString(arr1));

        for (int i = deleteIndex; i < arr1.length - 1; i++) {
            arr1[i] = arr1[i + 1];
        }
        arr1[arr1.length - 1] = 0;

        System.out.println("After removing array from index 1 : "+Arrays.toString(arr1));


        //Traversal:
        //Traversing an array means accessing each element sequentially.

        int[] array = {10, 20, 30, 40, 50};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }
}
