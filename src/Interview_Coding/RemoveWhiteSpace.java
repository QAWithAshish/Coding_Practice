package Interview_Coding;

public class RemoveWhiteSpace {

    public static void main(String[] args) {

        String str = "Hello   ashish how are you ";

        String output = byUsingReplace(str);
        System.out.println("After removing spaces => " + output);

        String output2 = byUsingReplaceAll(str);
        System.out.println(output2);

    }

    public static String byUsingReplace(String str) {
        return str.replace(" ", "");
    }

    public static String byUsingReplaceAll(String str) {
        return str.replaceAll("\\s", "");
    }
}
