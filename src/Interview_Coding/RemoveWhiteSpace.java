package Interview_Coding;

public class RemoveWhiteSpace {

    public static void main(String[] args) {

        String str = "Hello   ashish how are you ";

        String remStr = str.replaceAll(" ", "");

        System.out.println(remStr);

    }
}
