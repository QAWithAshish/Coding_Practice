package Java_Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Showing 5 different ways to copy a List to another List with an example.
1. Using Constructor
2. Using addAll() method
3. Using Collections.copy() method
4. Using Java 8
5. Using Java 10
*/
public class CopyListExamples {

    public static void main(String[] args) {


        // 1. Using Constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("WaterMelons");

        System.out.println(fruits);
        List<String> copy =new ArrayList<>(fruits);
        System.out.println("Copying fruits into copy object => "+copy);

        // 2. Using addAll() method
        List<String> copy1 =new ArrayList<>();
        copy1.addAll(fruits);
        System.out.println("Using addAll() method => "+copy1);

        // 3. Using Collections.copy() method
        List<String> copy2 = new ArrayList<>(fruits.size());
        copy2.add("a");
        copy2.add("b");
        copy2.add("c");
        copy2.add("d");
        copy2.add("e");

        Collections.copy(copy2,fruits);
        System.out.println("Using Collections.copy() method "+copy2);

        // 4. Using Java 8
        List<String> copyOfFruits = fruits.stream().collect(Collectors.toList());
        System.out.println(copyOfFruits);

        // 5. Using Java 10
        List<String> copyOffruitsf = List.copyOf(fruits);
        System.out.println("Using java 10 "+copyOffruitsf);
    }
}
