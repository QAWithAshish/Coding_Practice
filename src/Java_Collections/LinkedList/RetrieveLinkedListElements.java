package Java_Collections.LinkedList;


import java.util.LinkedList;

// - How to get the first element in the LinkedList.
// - How to get the last element in the LinkedList.
// - How to get the element at a given index in the LinkedList.
// - How to get all elements from LinkedList
// - How to get all elements from LinkedList using java 8
public class RetrieveLinkedListElements {

    public static void main(String[] args) {

        LinkedList<String> courses = new LinkedList<>();

        courses.add("Java");
        courses.add("C#");
        courses.add(".net");
        courses.add("Ruby");
        courses.add("Python");

        // - How to get the first element in the LinkedList.
        String firstElement = courses.getFirst();
        System.out.println("First element of LinkedList is => " + firstElement);

        // - How to get the last element in the LinkedList.
        String lastElement = courses.getLast();
        System.out.println("Last element of LinkedList is => " + lastElement);

        // - How to get the element at a given index in the LinkedList.
        String element = courses.get(1);
        System.out.println("Getting element from index 1 => "+element);

        // - How to get all elements from LinkedList
        for(String course : courses){
            System.out.println("Getting all elements from LinkedList => "+course);
        }

        // - How to get all elements from LinkedList using java 8
        courses.stream().forEach(course -> {
            System.out.println("Using java 8 Stream => "+course);
        });

    }
}
