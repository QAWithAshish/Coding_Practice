package Java_Collections.LinkedList;


// - How to remove the first element in the LinkedList.
// - How to remove the last element in the LinkedList.
// - How to remove the first occurrence of a given element in the LinkedList.
// - How to clear the LinkedList completely.

import java.util.LinkedList;

public class RemoveElementsFromLinkedList {

    public static void main(String[] args) {

        LinkedList<String> fruits =new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Watermelon");
        fruits.add("Coconut");

        System.out.println("Initial LinkedList => "+fruits);

        // - How to remove the first element in the LinkedList.
        String removeFirst = fruits.removeFirst();
        System.out.println("After removing first element and name of element => "+removeFirst);

        // - How to remove the last element in the LinkedList.
        String removeLast = fruits.removeLast();
        System.out.println("After removing last element and name of element => "+removeLast);

        // - How to remove the first occurrence of a given element in the LinkedList.
        fruits.removeFirstOccurrence("Mango");
        System.out.println(fruits);

        // - How to clear the LinkedList completely.
        fruits.clear();
        System.out.println("Clear the LinkedList completely => "+fruits);
    }
}
