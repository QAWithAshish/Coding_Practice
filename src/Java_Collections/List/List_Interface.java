package Java_Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class List_Interface {


    public static void main(String[] args) {

     /*   When we go for List interface ?

          When ever you want to represent a group of individual object as single entity
          and this group of object can duplicate and this group of element maintains insertion order then
          we can go for List interface
     */

        List<String> list = new ArrayList<>();

        //To add into the list we use .add() method
        list.add("Ashish1"); //0
        list.add("Rohan2");  //1
        list.add("Ashish4"); //2
        list.add("Vishal5"); //3
        list.add("Ashish3"); //4
        list.add("Vishal6"); //5

        //We can add null elements in the list as well
        list.add(null);

        System.out.println(list);

        //List maintain insertion order
        System.out.println(list);

        //Get the Size of the list using .size() method from List interface
        System.out.println(list.size());

        //Using .isEmpty() to know list is empty and return true value
        System.out.println(list.isEmpty());

        //Using .contains() to find the same present in the list
        System.out.println(list.contains("Vijay"));

        //Get access from the list of the elements by using .get(index)
        System.out.println(list.get(0));
        System.out.println(list.get(4));

    }
}
