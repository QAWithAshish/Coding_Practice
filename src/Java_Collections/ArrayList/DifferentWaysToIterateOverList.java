package Java_Collections.ArrayList;

// 1. Basic for loop
// 2. Enhanced for loop
// 3. Iterator with for loop
// 4. Iterator with while loop
// 5. Using Java 8 stream with lambda
// 6. Using forEach method with lambda

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList {

    public static void main(String[] args) {

        List<String> courses = Arrays.asList("C", "C++", "Java", "Python", ".NET");

        // 1. Basic for loop
        for (int i = 0; i < courses.size(); i++) {
            System.out.println("Using Basic for loop => " + courses.get(i));
        }
        System.out.println("*******************************************************************");

        // 2. Enhanced for loop
        for (String listOfCourses : courses) {
            System.out.println("Using Enhanced for loop => " + listOfCourses);
        }
        System.out.println("*******************************************************************");

        // 3. Iterator with for loop
        for (Iterator<String> iterator = courses.iterator(); iterator.hasNext(); ) {
            String element = iterator.next();
            System.out.println("Using Iterator with for loop => " + element);
        }

        System.out.println("*******************************************************************");

        // 4. Iterator with while loop
        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()) {
            String course = iterator.next();
            System.out.println("Using Iterator with while loop => " + course);
        }

        System.out.println("*******************************************************************");

        // 5. Using Java 8 stream with lambda
        courses.stream().forEach(course ->
                System.out.println("Using Java 8 stream with lambda => " + course));

        System.out.println("*******************************************************************");

        // 6. Using forEach method with lambda
        courses.forEach((course) -> System.out.println("Using forEach method with lambda => "+course));
    }
}
