package Java_Collections.HashSet;

import java.util.*;

/*
- Enhanced for loop
- Basic loop with an iterator
- While loop with an iterator
- JDK 8 forEach() method with lambda
- JDK 8 streaming + forEach() + lambda expression
*/
public class DifferentWaysToIterateHashSet {

    public static void main(String[] args) {


        Set<String> courses = new HashSet<>();
        courses.add("C");
        courses.add("C++");
        courses.add("C#");
        courses.add("Java");
        courses.add("Python");

        // - Enhanced for loop
        for(String course : courses){
            System.out.println("Using enhanced for loop "+course);
        }

        System.out.println("**********************************");

        // - Basic loop with an iterator
        for(Iterator iterator = courses.iterator(); iterator.hasNext();){
          String element= (String) iterator.next();
            System.out.println("Basic loop with an iterator "+element);
        }

        System.out.println("**********************************");

        // - While loop with an iterator
        Iterator iterator =courses.iterator();
        while (iterator.hasNext()){
          String element=(String) iterator.next();
            System.out.println("While loop with an iterator "+element);
        }

        System.out.println("**********************************");

        // - JDK 8 forEach() method with lambda
        courses.forEach(course -> {
            System.out.println("JDK 8 forEach() method with lambda "+course);
        });

        System.out.println("**********************************");

        // - JDK 8 streaming + forEach() + lambda expression
        courses.stream().filter( course -> !"Java".equals(course))
        .forEach(course -> {
            System.out.println("JDK 8 streaming + forEach() + lambda expression "+course);
        });

    }
}
