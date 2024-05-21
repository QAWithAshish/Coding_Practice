package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList_Stream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana", "Strawberry", "Mango", "Pineapple", "Litchi", "Watermelon", "Papaya","Apple");

        List<String> result = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
