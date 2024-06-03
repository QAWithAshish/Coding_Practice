package Java_Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*
    - CopyOnWriteArrayList in java is a thread safe implementation of list interface.

    - CopyOnWriteArrayList was added in java 1.5 and part of collection framework.

    - CopyOnWriteArrayList is concurrent collection of class and thread safe variant
      of java.util.ArrayList in which all the mutative operation (add,set and so on)
      are implemented by making of fresh copy of the underlying array.

    - Iterator throws concurrentModificationException if list size is changed.

    - CopyOnWriteArrayList is very useful in multithreaded programs When we want
      to iterate over the list in a thread-safe way without an explicit synchronization.

    - The design of the CopyOnWriteArrayList uses  an interesting technique to make in thread-safe without
      need for synchronization. When we are using any of modify methods Such as - remove() or add()
      the whole content of CopyOnWriteArrayList is copied into the new internal copy.

 */
public class CopyOnWrite_ArrayList {

    public static void main(String[] args) {

        //List<String> list = new ArrayList<>();

        List<String> list = new CopyOnWriteArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            String str = listIterator.next();

            if (str.equals("Three")) {
                list.remove("Three");
                System.out.println(list);
            }
            if (str.equals("One")) {
                list.add("Four");
                System.out.println(list);
            }
            System.out.println(list);
        }


    }
}
