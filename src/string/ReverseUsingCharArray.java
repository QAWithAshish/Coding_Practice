package string;

public class ReverseUsingCharArray {

    public static void main(String[] args) {

        String str = "hello";
        reverseUsingCharArray(str);
        System.out.println("");
        reverseUsingCharAt(str);
    }

    public static void reverseUsingCharArray(String str) {

        char[] chArr = str.toCharArray();

        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            System.out.print(chArr[i]);
        }
    }
    public static void reverseUsingCharAt(String str) {

        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
