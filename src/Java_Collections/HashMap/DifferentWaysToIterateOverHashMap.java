package Java_Collections.HashMap;
/*

1. Iterate through a HashMap EntrySet using Iterator
2. Iterate through HashMap KeySet using Iterator
3. Iterate HashMap using For-each Loop
4. Iterating through a HashMap using Lambda Expressions
5. Loop through a HashMap using Stream API

*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DifferentWaysToIterateOverHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> coursesMap = new HashMap<>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "C#");
        coursesMap.put(4, "JAVA");
        coursesMap.put(5, "Python");

        System.out.println(coursesMap);

        // 1. Iterate through a HashMap EntrySet using Iterator
        Iterator<Map.Entry<Integer, String>> iterator = coursesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> element = iterator.next();
            System.out.println(element);
        }

        System.out.println("****************************************************");

        // 2. Iterate through HashMap KeySet using Iterator
        Iterator<Integer> iteratorKey = coursesMap.keySet().iterator();
        while (iteratorKey.hasNext()) {
            Integer key = iteratorKey.next();
            System.out.println(key);
            System.out.println(coursesMap.get(key));
        }

        System.out.println("****************************************************");

        // 3. Iterate HashMap using For-each Loop
        for(Map.Entry<Integer,String> entry : coursesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("****************************************************");

        // 4. Iterating through a HashMap using Lambda Expressions
        coursesMap.forEach((key,value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        System.out.println("****************************************************");

        // 5. Loop through a HashMap using Stream API
        coursesMap.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }
}
