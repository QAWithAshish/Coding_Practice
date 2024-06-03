package Java_Collections.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableHashMap {

    public static void main(String[] args) {

    /*    Map<Integer, String> coursesMap = new HashMap<>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "C#");
        coursesMap.put(4, "JAVA");
        coursesMap.put(5, "Python");

        // Before java 9
        coursesMap = Collections.unmodifiableMap(coursesMap);
        coursesMap.put(1, "Go");
        System.out.println(coursesMap);*/

        // After java 9
        Map<String, String> map = Map.ofEntries(
                Map.entry("1", "Java"),
                Map.entry("2", "C#"),
                Map.entry("5", "Python"));
        System.out.println(map);
    }
}
