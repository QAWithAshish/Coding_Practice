package array;

import java.util.Arrays;

public class FindMaxAndMinArrayUsingStream {

    public static void main(String[] args) {

        int [] arr = {12,112,3,12547777,43};

        int min = Arrays.stream(arr).min().getAsInt();
        int max= Arrays.stream(arr).max().getAsInt();

        System.out.println("Max array => "+max);
        System.out.println("Min array => "+min);
    }
}
