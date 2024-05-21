package Java_8;

import java.util.stream.IntStream;

public class SumOfAllDigit_Stream {

    public static void main(String[] args) {

        int num = 12345;

        IntStream stream = String.valueOf(num)
                .chars();

        int sum = stream.map(Character::getNumericValue)
                .sum();

        System.out.println(sum);
    }
}
