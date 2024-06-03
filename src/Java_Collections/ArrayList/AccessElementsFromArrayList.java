package Java_Collections.ArrayList;


//- How to check if an ArrayList is empty using the isEmpty() method.
// - How to find the size of an ArrayList using the size() method.
// - How to access the element at a particular index in an ArrayList using the get() method.
//  - How to modify the element at a particular index in an ArrayList using the set() method.

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {

    public static void main(String[] args) {

        List<String> topProgrammingLanguages =new ArrayList<>();


        //- How to check if an ArrayList is empty using the isEmpty() method.
        System.out.println("Is programming language is empty ? :: "+topProgrammingLanguages.isEmpty());

        //Adding some languages in list
        topProgrammingLanguages.add("C");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add("C#");

        // - How to find the size of an ArrayList using the size() method.
        System.out.println("Here are the top "+topProgrammingLanguages.size() + "Programming languages in the world");

        // - How to access the element at a particular index in an ArrayList using the get() method.
        String bestProgrammingLanguage = topProgrammingLanguages.get(2);
        System.out.println("bestProgrammingLanguage => "+bestProgrammingLanguage);

        //  - How to modify the element at a particular index in an ArrayList using the set() method.
        System.out.println("Before using .set() => "+topProgrammingLanguages);
        topProgrammingLanguages.set(4,".NET");
        System.out.println("After using .set() => "+topProgrammingLanguages);

    }
}
