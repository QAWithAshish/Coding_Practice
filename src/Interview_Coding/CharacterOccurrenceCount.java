package Interview_Coding;

public class CharacterOccurrenceCount {

    public static void main(String[] args) {

        String str = "Hello ashish how are you";
        char charToGetCount = 'p';
        int countOfChar = getCharCount(str, charToGetCount);
        System.out.println(charToGetCount + " occurred " + countOfChar + " times in given string");
    }

    public static int getCharCount(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
