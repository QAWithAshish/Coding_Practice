package Interview_Coding;

public class RemoveOccurrenceOfChar {

    public static void main(String[] args) {
        String str = "cloudTech";
        char ch = 'c';

        removeChar(str, ch);

        removeChar(str);
    }

    public static void removeChar(String str, char ch) {
        int len = str.length();
        String finalStr = "";

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ch) {
                finalStr += str.charAt(i);
            }
        }
        System.out.println(finalStr);
    }

    public static void removeChar(String str) {
        String finalStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'c') {
                finalStr += str.charAt(i);
            }
        }
        System.out.println(finalStr);
    }
}
