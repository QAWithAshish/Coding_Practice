package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findDuplicateFromArray {

    public static void main(String[] args) {
        int[] arr = {12, 12, 2, 1, 2, 34, 54, 34};
        Set<Integer> duplicate = findDuplicate(arr);
        System.out.println("Duplicate in the string are => "+duplicate);
    }

    public static Set<Integer> findDuplicate(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int num : array) {
            if (!seen.add(num)) {
                duplicate.add(num);
            }else{
                seen.add(num);
            }
        }
        return duplicate;
    }

}
