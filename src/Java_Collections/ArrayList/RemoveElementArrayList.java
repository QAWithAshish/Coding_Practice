package Java_Collections.ArrayList;


//- How to remove the element at a given index in an ArrayList | remove(int index)
// - How to remove an element from an ArrayList | remove(Object o)
//  - How to remove all the elements from an ArrayList that exist in a given collection | removeAll()
//  - How to clear an ArrayList | clear()

import java.util.ArrayList;
import java.util.List;

public class RemoveElementArrayList {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");     //0
        fruits.add("Mango");     //1
        fruits.add("Banana");    //2
        fruits.add("Orange");    //3
        fruits.add("PineApple"); //4
        fruits.add("Grapes");    //5

        //- How to remove the element at a given index in an ArrayList | remove(int index)
        System.out.println("Before removing => " + fruits);

        fruits.remove(4);
        System.out.println("After removing => " + fruits);

        // - How to remove an element from an ArrayList | remove(Object o)
        System.out.println("Before removing Mango from index 1 => " + fruits);

        fruits.remove("Mango");
        System.out.println("After removing Mango from index 1 => " + fruits);

        //  - How to remove all the elements from an ArrayList that exist in a given collection | removeAll()
        List<String> subFruitsList =new ArrayList<>();
        subFruitsList.add("Apple");
        subFruitsList.add("Mango");

        System.out.println("Before using remove all method ::"+subFruitsList);
        subFruitsList.removeAll(subFruitsList);
        System.out.println("Using remove all method ::"+subFruitsList);

        //  - How to clear an ArrayList | clear()
        fruits.clear();
        System.out.println("Clear all data from ArrayList => " +fruits);

    }
}
