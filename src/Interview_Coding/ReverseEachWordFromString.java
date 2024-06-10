package Interview_Coding;

public class ReverseEachWordFromString {

    public static void main(String[] args) {

        String str= "Hello ashish how are you";
        String[] word = str.split(" ");

        for(int i=word.length-1;i>=0;i--){
            System.out.print(word[i] +" ");
        }
    }
}
