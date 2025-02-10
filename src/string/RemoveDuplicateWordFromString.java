package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordFromString {

    public static void main(String[] args) {

        String orgStr ="Hello ashish ashish how are are you you ! !";

       String [] str = orgStr.split("\\s");

       StringBuilder sb  = new StringBuilder();

       Set<String> set = new LinkedHashSet<>();

       for(String word : str){
           if(set.add(word)){
               sb.append(word).append(" ");
           }
       }
        System.out.println(sb.toString().trim());
    }
}
