package Java_8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFrequency_Stream {

    //How to find frequency of each character in string using java 8 stream
    public static void main(String[] args) {

        String str = "Ashish Bhalray";


        IntStream stream = str.chars();
        Stream<Character> characterStream = stream
                .mapToObj(c -> (char) c);

        Map<Character, Long> map = characterStream
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(map);

    }
}
