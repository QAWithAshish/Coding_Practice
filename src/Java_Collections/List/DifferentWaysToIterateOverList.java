package Java_Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class DifferentWaysToIterateOverList {

    public static void main(String[] args) {

        List<String> courses = Arrays.asList("C","C++","Java","Python","Go");

        //Basic for loop
        for(int i=0;i<courses.size();i++){
            System.out.println(courses.get(i));
        }
        System.out.println("**********************************");
        // For-each loop
        for(String course : courses){
            System.out.println(course);
        }
        System.out.println("**********************************");

        // Using Iterator
        ListIterator<String> course = courses.listIterator();
        while (course.hasNext()){
            String element = course.next();
            System.out.println(element);
        }

        System.out.println("**********************************");

        //Using java 8 Stream api
        courses.stream().forEach(courseL -> {
            System.out.println(courseL);
        });

        System.out.println("**********************************");

        //Using java For-Each lambda
        courses.forEach(courseList -> {
            System.out.println(courseList);
        });

    }
}
