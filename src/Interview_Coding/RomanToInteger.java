package Interview_Coding;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        String roman = "MCMXCIV"; // Example Roman numeral
        int result = romanToInt(roman);
        System.out.println("The integer value of the Roman numeral " + roman + " is: " + result);
    }

    public static int romanToInt(String s) {
        // Define a map for Roman numerals and their integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Process each character from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            // If current value is less than the previous value, subtract it from total
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            // Update previous value
            prevValue = currentValue;
        }

        return total;
    }

}
