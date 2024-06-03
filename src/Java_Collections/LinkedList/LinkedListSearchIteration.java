package Java_Collections.LinkedList;


// - How to check if an element exists in a LinkedList.
// - How to find the index of the first occurrence of an element in the LinkedList.
// - How to find the index of the last occurrence of an element in the LinkedList.

import java.util.LinkedList;
import java.util.ListIterator;

/*      Iterating over a LinkedList example shows how to iterate over a LinkedList using:
        - Java 8 forEach() and lambda expression.
        - iterator()
        - iterator() and Java 8 forEachRemaining() method
        - descendingIterator()
        - listIterator()
        - simple for-each loop
 */
public class LinkedListSearchIteration {

    public static void main(String[] args) {

        LinkedList<String> topProgrammingLanguages = new LinkedList<>();
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add("JS");
        topProgrammingLanguages.add("Ruby");
        topProgrammingLanguages.add("Ruby");
        topProgrammingLanguages.add("Go");

        System.out.println("Initial LinkedList => " + topProgrammingLanguages);


        // - How to check if an element exists in a LinkedList.
        boolean isJavaPresent = topProgrammingLanguages.contains("Java");
        System.out.println("In LinkedList is java is present :: " + isJavaPresent);

        // - How to find the index of the first occurrence of an element in the LinkedList.
        int indexOfGo = topProgrammingLanguages.indexOf("Go");
        System.out.println("Index of Go language in the list :: " + indexOfGo);

        // - How to find the index of the last occurrence of an element in the LinkedList.
        int lastIndexOf = topProgrammingLanguages.lastIndexOf("Ruby");
        System.out.println("Index of last occurrence of an element "+lastIndexOf);

        // iterator()
        ListIterator<String> listOfProgramming = topProgrammingLanguages.listIterator();
        while (listOfProgramming.hasNext()){
            String element = listOfProgramming.next();
            System.out.println("Using iterator() "+element);
        }

        //Java 8 forEach() and lambda expression.
        topProgrammingLanguages.forEach(p -> {
            System.out.println("Using Java 8 forEach() and lambda expression "+p);
        });

    }
}
