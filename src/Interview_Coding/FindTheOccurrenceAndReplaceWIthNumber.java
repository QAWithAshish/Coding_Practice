package Interview_Coding;

import java.util.Arrays;

public class FindTheOccurrenceAndReplaceWIthNumber {


    public static void main(String[] args) {
        String input = "opentextfortoto";
        char replaceChar = 't';

        if (input.indexOf(replaceChar) == -1) {
            System.out.println("given character not available in the string ");
            System.exit(0);
        }

        char[] arr = input.toCharArray();
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == replaceChar) {
                arr[i] = String.valueOf(count).charAt(0);
                count++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
