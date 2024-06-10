package Java_Collections;


import Java_Collections.List.Employee;

import java.util.*;

/*
   // 1. Always use interface type as a reference type.
   // 2. Always use interface type as a return type.
   // 3. Always use Interface Types as a method argument
 */
public class CollectionsBestPractices {

    public static void main(String[] args) {


        // 1. Always use interface type as a reference type.

        // For example, use List, Set, Map interfaces as a reference type.
        // Better
        List<String> list = new ArrayList<>();

        // Avoid
        ArrayList<String> lists = new ArrayList<>();

        // Better
        Set<String> set = new HashSet<>();

        //Avoid
        HashSet<String> employees = new HashSet<>();

        // Better
        Map<String, String> map = new HashMap<>();

        //Avoid
        HashMap<String, String> maps = new HashMap<>();

        /*
        By declaring a collection using an interface type, the code would be more flexible
        as you can change the concrete implementation easily when needed,
         for example:

            List<String> list = new LinkedList<>();

        When your code is designed to depend on the List interface, then you can swap among List’s implementations with ease,
        without modifying the code that uses it.
        */


    }

    // 2. Always use interface type as a return type
    public Collection listEmployees() {
        List<Employee> employees = new ArrayList<>();
        // add Employees to the list
        return employees;
    }

    // 3. Always use Interface Types as a method argument
    public void foo(Set<Integer> numbers) {
    }
}
