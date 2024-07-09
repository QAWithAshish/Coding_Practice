package Interview_Coding;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFreestOccurrenceFromString {

    public static void main(String[] args) {
        String inputString = "swiss";

        Character result = findFirstNonRepeatingChar(inputString);

        if (result != null) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }
    }

    public static Character findFirstNonRepeatingChar(String inputString) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the occurrences of each character in the string
        for (char c : inputString.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

}
