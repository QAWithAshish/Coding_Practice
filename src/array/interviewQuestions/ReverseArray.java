package array.interviewQuestions;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {12, 23, 45, 3, 86, 1, 9};
        System.out.println("Before reveres =>" + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("After reveres =>" + Arrays.toString(arr));

    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;

        }
    }
}
