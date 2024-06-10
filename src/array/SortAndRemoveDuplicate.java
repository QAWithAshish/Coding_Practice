package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortAndRemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 10, 20};

        int[] sortedAndUniqueArray = sortAndRemoveDuplicates(arr);
        System.out.println("Sorted and Unique Array: " + Arrays.toString(sortedAndUniqueArray));
    }

    public static int[] sortAndRemoveDuplicates(int[] array) {
        // Sort the array
        Arrays.sort(array);

        // Use a LinkedHashSet to remove duplicates while maintaining order
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }

        // Convert the set back to an array
        int[] resultArray = new int[uniqueElements.size()];
        int i = 0;
        for (int num : uniqueElements) {
            resultArray[i++] = num;
        }

        return resultArray;
    }
}
