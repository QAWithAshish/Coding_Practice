package Interview_Coding;

public class ReverseEachWord {

    public static void main(String[] args) {
        String str = "Hello My Name is Ashish";

        // Method 1: using split() and StringBuffer()
        String reverseEachWord = reverseEachWord(str);
        System.out.println(reverseEachWord);

        //Method 2: using traditional method
        reverseEachWordTraditional(str);
    }

    // Method 1: using split() and StringBuffer()
    public static String reverseEachWord(String str) {
        String[] words = str.split("\\s+");
        StringBuffer reverseString = new StringBuffer();

        for (String word : words) {
            StringBuffer reverseWord = new StringBuffer(word);
            reverseString.append(reverseWord.reverse().append(" "));
        }
        return reverseString.toString().trim();
    }

    //Method 2: using traditional method
    public static void reverseEachWordTraditional(String str) {

        String[] word = str.split(" ");

        String reversString = "";

        for (String w : word) {

            String reversWord = "";

            for (int i = w.length() - 1; i >= 0; i--) {

                reversWord = reversWord + w.charAt(i);
            }
            reversString = reversString + reversWord + " ";
        }
        System.out.println(reversString);

    }
}
