package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static String removeDuplicatechar(String str) {

		int count=0;
		String newStr = "";
		
		for(int i=0;i<str.length();i++) {
		 char ch=str.charAt(i);	
		 
		 if(newStr.indexOf(ch)==-1) {
			 newStr=newStr+ch;
			 count++;
		 }

		}
		System.out.println(count);
		return newStr;
	}

	public static void removeDuplicate(String str){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int indexCh = str.indexOf(ch, i + 1);

			if(indexCh == -1){
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
	public static void removeDuplicateUsingSet(String str){
		StringBuilder sb = new StringBuilder();

		Set<Character> setStr = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++){
			setStr.add(str.charAt(i));
		}
		for(Character c : setStr ){
			sb.append(c);
		}
		System.out.println(sb);
	}



	public static void main(String[] args) {
		
		String str="abbooaaccscsdcd";
		System.out.println("old string is = "+str);
		//System.out.println("New string is = "+removeDuplicatechar(str));
		removeDuplicate(str);
		removeDuplicateUsingSet(str);
	}

}
