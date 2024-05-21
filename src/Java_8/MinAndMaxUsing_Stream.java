package Java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxUsing_Stream {


    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(12,344,55466,1,234,23455,21,323);

        //Find Max array from list
        int max = arrList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max array : "+max);

        //Find Min array from list
        int min = arrList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min array : "+min);


        //Find 2nd Max array from list
        int secondMax = arrList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println("Second largest number : "+secondMax);


    }

}
