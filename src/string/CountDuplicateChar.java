package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Statement");
		String str = sc.nextLine();

		sc.close();
		
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : ch) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}else {
				map.put(c, 1);
			}
		}
		
		for (Character c : map.keySet()) {

			if (map.get(c)>1) {
				System.out.println("Character "+c+ " is repeted " +map.get(c)+" times");
			}
		}
		
	
	}

}
