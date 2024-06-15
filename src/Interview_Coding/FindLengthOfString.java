package Interview_Coding;

public class FindLengthOfString {

    public static void main(String[] args) {
        String str = "Hello";

       // findLengthOfString(str);

        int count = findLengthOfString_2ndWay(str);
        System.out.println("Length of the string => "+count);
    }

    public static void findLengthOfString(String str) {

        int length = 0;
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            length++;
        }
        System.out.println("Length of the string is => " + length);

    }

    public static int findLengthOfString_2ndWay(String str) {

        int length = 0;
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            length++;
        }
        return length;
    }
}
