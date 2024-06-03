package Java_Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListExample {

    public static void main(String[] args) {

     /*   // How to make arrayList as mutable
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Apple");

        //Before java 9
        List<String> fruits = Collections.unmodifiableList(list);
        fruits.add("WaterMelons");
        System.out.println(fruits);

        //This will throw java.lang.UnsupportedOperationException
        */

        List<String> fruits = List.of("Apple","Banana","Mango","Orange");
        fruits.add("WaterMelons");
        System.out.println(fruits);


    }
}
