package Java_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFromCollection {

    /*
    - How to create an ArrayList from another collection using the ArrayList(Collection c) constructor.

    - How to add all the elements from an existing collection to the new ArrayList using the addAll() method.

    */

    public static void main(String[] args) {

        List<Integer> firstFivePrimeNumber =new ArrayList<>();
        firstFivePrimeNumber.add(1);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(7);
        firstFivePrimeNumber.add(11);

        List<Integer> firstTenPrimeNumber = new ArrayList<>(firstFivePrimeNumber);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        //Using .addAll() method to add two array list with collection
        firstTenPrimeNumber.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumber);


    }
}
