package Java_Collections.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
- Sorting List of String objects in Ascending order
- Sorting List of String objects in Descending order
- Sorting List of Employee objects (By Salary) in Ascending order
- Sorting List of Employee objects (By Salary) in Descending order
- Sorting List of Employee objects (By Age) in Ascending order
- Sorting List of Employee objects (By Age) in Descending order
- Sorting List of Employee objects (By Name) in Ascending order
- Sorting List of Employee objects (By Name) in Descending order
*/
public class SortingListUsingStream {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("Un-Sorted list => " + fruits);

        // - Sorting List of String objects in Ascending order
        //Method- 1
        List<String> sortedList = fruits.stream().
                sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Sorted list using Comparator => " + sortedList);

        //Method- 2
        sortedList = fruits.stream().
                sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println("Ascending order using lambda => " + sortedList);

        //Method- 3
        sortedList = fruits.stream().
                sorted().collect(Collectors.toList());
        System.out.println("Using default sorted method => " + sortedList);


        // - Sorting List of String objects in Descending order
        //Method- 1
        List<String> desList = fruits.stream().
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted list descending order => " + desList);

        //Method- 2
        List<String> desListM2 = fruits.stream().
                sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println("Sorted list descending order using lambda => " + desListM2);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Rajesh", 21, 400000));
        employeeList.add(new Employee(105, "Ashish", 23, 500000));
        employeeList.add(new Employee(102, "Vinod", 20, 450000));
        employeeList.add(new Employee(104, "Rahul", 24, 800000));

        // - Sorting List of Employee objects (By Salary) in Ascending order
        // - Sorting List of Employee objects (By Salary) in Descending order

        //Method- 1
        List<Employee> sortedEmployee = employeeList.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // return (int) (o1.getSalary() - o2.getSalary()); // Ascending order
                return (int) (o2.getSalary() - o1.getSalary()); // Descending order
            }
        }).collect(Collectors.toList());
        //System.out.println("Sorted with salary Low -> High "+sortedEmployee);  // Ascending order
        System.out.println("Sorted with salary High -> Low " + sortedEmployee); // Descending order

        //Method- 2
        // Ascending order
        List<Employee> sortedEmployeeListAse = employeeList.stream().sorted(
                (o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println("Sorted with salary Low -> High using lambda " + sortedEmployeeListAse);

        // Descending order
        List<Employee> sortedEmployeeListDes = employeeList.stream().sorted(
                (o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
        System.out.println("Sorted with salary High -> Low using lambda " + sortedEmployeeListDes);

        //Sorting using Comparator.comparingLong(Employee::getSalary) ||   // Ascending order
        List<Employee> sortedListUsingCompar = employeeList.stream().
                sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        System.out.println("Sorted list using Comparator.comparingLong(Employee::getSalary) "+sortedListUsingCompar);

        //Sorting using Comparator.comparingLong(Employee::getSalary) ||   // Descending order
        List<Employee> sortedListUsingComparDes = employeeList.stream().
                sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("Sorted list using Comparator.comparingLong(Employee::getSalary) Des "+sortedListUsingComparDes);


        //- Sorting List of Employee objects (By Age) in Ascending order
        //- Sorting List of Employee objects (By Age) in Descending order
        // Ascending order
        List<Employee> sortedEmployeeListByAge = employeeList.stream().sorted(
                (o1, o2) -> (int) (o1.getAge() - o2.getAge())).collect(Collectors.toList());
        System.out.println("Sorted with age Low -> High using lambda " + sortedEmployeeListByAge);

        // Descending order
        List<Employee> sortedEmployeeListByAgeDes = employeeList.stream().sorted(
                (o1, o2) -> (int) (o2.getAge() - o1.getAge())).collect(Collectors.toList());
        System.out.println("Sorted with age High -> Low using lambda " + sortedEmployeeListByAgeDes);

        //Sorting using Comparator.comparingLong(Employee::getAge) ||   // Ascending order
        List<Employee> sortedListByAgeAse = employeeList.stream().
                sorted(Comparator.comparingLong(Employee::getAge)).collect(Collectors.toList());
        System.out.println("Sorted list using Comparator.comparingLong(Employee::getAge) "+sortedListByAgeAse);

        //Sorting using Comparator.comparingLong(Employee::getAge) ||   // Descending order
        List<Employee> sortedListByAgeDes = employeeList.stream().
                sorted(Comparator.comparingLong(Employee::getAge).reversed()).collect(Collectors.toList());
        System.out.println("Sorted list using Comparator.comparingLong(Employee::getAge) Des "+sortedListByAgeDes);

        //- Sorting List of Employee objects (By Name) in Ascending order
        //- Sorting List of Employee objects (By Name) in Descending order

        //Sorting using Comparator.comparingLong(Employee::getAge) ||   // Ascending order
        List<Employee> sortedListByNameAse = employeeList.stream().
                sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println("Sorted list using Comparator.comparing(Employee::getName) "+sortedListByNameAse);

        //Sorting using Comparator.comparingLong(Employee::getAge) ||   // Descending order
        List<Employee> sortedListByNameDes = employeeList.stream().
                sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
        System.out.println("Sorted list using Comparator.comparing(Employee::getName) Des "+sortedListByNameDes);



    }
}
