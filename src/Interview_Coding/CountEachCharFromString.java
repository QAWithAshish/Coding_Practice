package Interview_Coding;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountEachCharFromString {


    public static void main(String[] args) {
        String orgStr = "ashish@gmail.com ";
        getEachCountOfChar(orgStr);
    }

    public static void getEachCountOfChar(String str) {
          HashMap<Character, Integer> map = new HashMap<>(); //  || HashMap does not maintain order.
       // LinkedHashMap<Character,Integer> map =new LinkedHashMap<>(); || If you want to maintain order use LinkedHashMap.
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (map.containsKey(currentChar)) {
                int count = map.get(currentChar);
                map.put(currentChar, count + 1);
            } else {
                map.put(currentChar, 1);
            }
        }

        System.out.println(map);
    }
}
