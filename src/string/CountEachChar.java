package string;

import java.util.HashMap;

public class CountEachChar {

    public static void main(String[] args) {
        String str="ashishbhalray@gmail.com";

     /*   HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){

            if(map.containsKey(str.charAt(i))){
                int count=map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);*/
        getString(str);
    }
    public static void getString(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){

            if(map.containsKey(str.charAt((i)))){
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);

    }
}
