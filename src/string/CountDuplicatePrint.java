package string;

import java.util.HashMap;

public class CountDuplicatePrint {
    public static void main(String[] args) {

        String str = "aaaaabbbccccccddd";
        String[] split = str.split("");
        int counts = 0;
        String uniq = "";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(split[i])) {
                counts++;
            } else {
                uniq += split[i];
                map.put(split[i], 1);
            }
        }
        System.out.println(uniq + " " + counts);
    }
}

