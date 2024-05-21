package Java_8;

import java.util.Arrays;
import java.util.List;

public class LastElementOfString_Stream {

    //Find the last element from given list
    public static void main(String[] args) {


        List<String> listOfElement =
                Arrays.asList("One", "Two", "Three", "Four", "Five");

        String result = listOfElement.stream()
                .skip(listOfElement.size() - 1)
                .findFirst()
                .orElseThrow();

        System.out.println(result);



    }
}
