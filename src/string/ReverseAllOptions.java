package string;

import java.util.stream.Collectors;

public class ReverseAllOptions {

    public static void reverseWIthSBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        System.out.println("Reverse string is with String Builder  :" + reverse);
    }

    public static void reverseWIthSBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        System.out.println("Reverse string is with String Buffer :" + reverse);
    }

    public static void reverseUsingCharAt(String str) {

        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse string is with OldSchoolMethod :" + rev);

    }
    public static void reverseUsingCharArray(String str) {

        char[] chArray = str.toCharArray();
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(chArray[i]);
        }


    }

    public static void reverseWithJavaStreamAPI(String str) {
        // Using Java Stream API to reverse the string
        String reversed = new StringBuilder(str)
                .reverse()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }

    public static void main(String[] args) {

        reverseWIthSBuilder("Hello Ashish");
        reverseWIthSBuffer("Oye Ashish");
        reverseUsingCharAt("Trying first test");
        reverseWithJavaStreamAPI("Oye Ashish");
        reverseUsingCharArray("Orr Bhai");
    }
}
