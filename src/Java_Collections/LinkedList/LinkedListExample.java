package Java_Collections.LinkedList;

/*
    - In Java LinkedList class can contains duplicate elements.
    - In Java LinkedList class maintain insertion order.
    - The LinkedList class implements Queue and Deque interface,
      therefore, it also can use as a Queue, Deque and stack.
    - Java LinkedList is not thread-safe, You must explicitly synchronize
      concurrent Modification to the LinkedList in multithreaded environment.
*/

// add()          --> From List interface
// add(2,element) --> From List interface
// addFirst()     --> From Deque interface
// addLast()      --> From Deque interface

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> linkedList =new LinkedList<>();

        // add() --> From List interface
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Four");
        linkedList.add("Five");

        System.out.println("Initial LinkedList => "+linkedList);

        // add(2,element) --> From List interface || By giving the index posting we can insert the element into the list
        linkedList.add(2,"Three");
        System.out.println("After adding Three in LinkedList => "+linkedList);

        // addFirst()     --> From Deque interface
        linkedList.addFirst("Zero");
        System.out.println("After adding zero in LinkedList => "+linkedList);

        // addLast()      --> From Deque interface
        linkedList.addLast("Six");
        System.out.println("After adding Six in LinkedList =>"+linkedList);

    }
}
