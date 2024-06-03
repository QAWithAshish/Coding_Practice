package Java_Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Class {

    /*
    ArrayList class overView

   1- An ArrayList is re-sizeable array , also called as dynamic array
    it grow its size to accommodate to new element and
    shrinks the size of the element are removed.

   2- ArrayList internally uses an array o store the element ,just like array,
    it allows you to retrieve the element by there index.

   3- ArrayList allow duplicate and null values.

   4- ArrayList is an ordered collection, it maintains insertion order of the elements

   5- You can not create ArrayList with primitive dateTypes like char,int ,
      We need to use Boxed type [ Wrapper classes ] like Integer,Character,Boolean etc.

   6- ArrayList is not synchronized. If multiple threads try to modify an arraylist
      at same time, then the final outcome will be non-deterministic
     */

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(10);
        arrayList.add(1021);
        arrayList.add(213);
        arrayList.add(13);

        System.out.println(arrayList);


    }
}
