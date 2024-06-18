package Interview_Coding;

public class CountEachWordFromString {

    public static void main(String[] args) {

        String str = "Hello ashish how are you I am good";
        int wordsCount = getCountOfWords(str);
        System.out.println("Output : "+wordsCount);

    }

    public static int getCountOfWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split(" ");
        return words.length;
    }
}
