package Java_Collections.HashSet;

/*
   - HashSet do not contain duplicate values it will remove the duplicate and show only unique elements.
   - HashSet allows null values but only one null value not more than one.
   - HashSet is an unordered collection, It does not maintain the order of insertion.
   - HashSet internally uses HashMap to store its elements.
   - HashSet is not threadSafe. If multiple threads try to modify HashSet at same time,
     then the final outcome will be non-deterministic. You have to explicit synchronize concurrent
     access to HashSet in multithreaded environment.

*/

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    // - HashSet do not contain duplicate values.
    public static void duplicateValuesInHashSet() {
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("One");
        set.add("Two");
        set.add("One");
        System.out.println(set);
    }
    // - HashSet allows null values, Not more than one.
    public static void nullValuesInHashSet(){
        Set<String> set =new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set);

    }
    // - HashSet is an unordered collection || Does not maintain insertion order.
    public static void unorderedHashSet(){
        Set<String> set =new HashSet<>();
        set.add("Element_1");
        set.add("Element_2");
        set.add("Element_4");
        set.add("Element_3");
        set.add("Element_5");
        set.add("Element_6");
        System.out.println(set);

    }

    public static void main(String[] args) {
        duplicateValuesInHashSet();
        nullValuesInHashSet();
        unorderedHashSet();
    }
}
