package Java_8;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers_Stream {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,4, 23, 3, 41, 32, 13, 3, 24, 45);

        number.stream()
                .filter((n) -> n % 2 == 0)
                .forEach((n) -> {
                    System.out.println(n);
                });


    }
}
