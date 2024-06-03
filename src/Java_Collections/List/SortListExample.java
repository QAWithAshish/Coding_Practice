package Java_Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*
- Sort List of integers using Collections.sort() method
- Sort List of Employee Objects in Ascending and Descending Order using Comparator
- Sort List of Employee Objects in Ascending and Descending Order using Lambda Expressions
*/
public class SortListExample {

    public static void main(String[] args) {

        // - Sort List of integers using Collections.sort() method
    /*    List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(1);
        list.add(6);

        System.out.println("Un-Sorted list => "+list);

        Collections.sort(list); // Ascending Order
        System.out.println(list);

        Collections.reverse(list); // Descending Order
        System.out.println(list);
        */


        // - Sort List of Employee Objects in Ascending and Descending Order using Comparator

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ashish", 20, 400000));
        employees.add(new Employee(102, "Rajat", 23, 450000));
        employees.add(new Employee(104, "Vinod", 26, 600000));
        employees.add(new Employee(103, "Raj", 22, 800000));
        employees.add(new Employee(108, "Rahul", 20, 400000));

      /*  Collections.sort(employees, new MySort()); // Ascending order ||  Descending order
          System.out.println(employees);
      */

        /*
         Collections.sort(employees, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return (int) (o2.getSalary() - o1.getSalary());
                    }
                }
        );
        System.out.println(employees);

        */

        // - Sort List of Employee Objects in Ascending and Descending Order using Lambda Expressions
        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        System.out.println(employees);

        // - Sort List of Employee Objects with names in Ascending and Descending Order using Lambda Expressions
        //  Collections.sort(employees,(o1,o2) -> (o1.getName().compareTo(o2.getName()))); // Ascending order
        Collections.sort(employees, (o1, o2) -> (o2.getName().compareTo(o1.getName()))); // Descending order
        System.out.println(employees);
    }

}

class MySort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // For Ascending order
        //return (int) (o1.getSalary() - o2.getSalary());
        //  For Descending order
        return (int) (o2.getSalary() - o1.getSalary());
    }
}
