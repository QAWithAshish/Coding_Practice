package Java_8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord_Stream {


    //Write a java program to reverse each word from string
    public static void main(String[] args) {

        String str = "Hello ashish how are you ";

        String[] words = str.split(" ");

        List<String> result = Arrays.stream(words)
                .map((word) ->
                        new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(result);
        reverserString("Or Bhai");

    }

    public static void reverserString(String str){

        String rev="";
        int len =str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse : "+rev);
    }
}
