package Java_Collections.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetExample {

    public static void main(String[] args) {

  /*      Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        // Before java 9
        fruits = Collections.unmodifiableSet(fruits);
        fruits.add("WaterMelons");
        System.out.println(fruits);*/

        // After java 9
        Set<String> fruit = Set.of("Banana", "Orange", "Apple");
        fruit.add("Mango");
        System.out.println(fruit);

    }
}
