package javaProgrames;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter any charater ");
		
		char c= sc.next().charAt(0);
		
		boolean isVowel=false;
		
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel =true;
	
		
		}
		
		if(isVowel) {
			System.out.println(c+" is Vowel");
		}else {
			System.out.println(c+" is not a Vowel");
		}
	}

}
