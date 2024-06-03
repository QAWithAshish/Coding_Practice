package Java_Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIterator {

    public static void main(String[] args) {

        List<String> programmingLanguages = new ArrayList<>();

        //Adding some languages in list
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C#");

        //Getting ListIterator
        ListIterator<String> listIterator = programmingLanguages.listIterator();
        System.out.println("Forward direction iterator : ");

        // .hasNext()
        // .next()
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
        }

        // .hasPrevious()
        // .previous()
        System.out.println("Backward direction iterator : ");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }

    }
}
