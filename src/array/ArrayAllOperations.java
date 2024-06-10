package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayAllOperations {


    public static void main(String[] args) {
        // Single-Dimensional Array
        int[] singleArray = {10, 20, 30, 40, 50};
        System.out.println("Single-Dimensional Array: " + Arrays.toString(singleArray));

        // Multi-Dimensional Array
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Multi-Dimensional Array:");
        for (int[] row : multiArray) {
            System.out.println(Arrays.toString(row));
        }

        // Find Maximum/Minimum
        int max = findMax(singleArray);
        int min = findMin(singleArray);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Reverse Array
        reverseArray(singleArray);
        System.out.println("Reversed Array: " + Arrays.toString(singleArray));

        // Find Duplicates
        int[] arrayWithDuplicates = {10, 20, 30, 20, 40, 10};
        Set<Integer> duplicates = findDuplicates(arrayWithDuplicates);
        System.out.println("Duplicates: " + duplicates);

        // Sorted array
        int[] arrays = {10, 20, 5, 40, 15};
        int[] sortedArray = sortArray(arrays);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

        // Remove duplicate
        int[] array = {10, 20, 30, 20, 40, 10};
        Set<Integer> uniqueElements = removeDuplicates(array);
        System.out.println("Unique Elements: " + uniqueElements);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    public static Set<Integer> findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }


    public static int[] sortArray(int[] array) {
        // Copy the input array to avoid modifying the original array
        int[] sortedArray = Arrays.copyOf(array, array.length);
        // Sort the copied array
        Arrays.sort(sortedArray);
        return sortedArray;
    }
    public static Set<Integer> removeDuplicates(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }
        return uniqueElements;
    }
}
