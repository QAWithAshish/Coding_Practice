package javaProgrames;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintOneToHundredUsingStream {

    public static void main(String[] args) {

        IntStream.range(1,100).forEach(x -> System.out.println(x));

        int [] arr= {1,2,3,4,5,6};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
