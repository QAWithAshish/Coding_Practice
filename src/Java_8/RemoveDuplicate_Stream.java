package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate_Stream {

    //Write a java program to remove duplicate from a list
    public static void main(String[] args) {

        List<Integer> listOfElements =
                Arrays.asList(1, 33, 22, 33, 1, 1, 23, 4, 44);

        List<Integer> result =
                listOfElements.stream()
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(result);
    }
}
