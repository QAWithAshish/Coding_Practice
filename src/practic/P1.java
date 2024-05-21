package practic;

import string.ReverseString;

public class P1 {

	public static void main(String[] args) {
		
		
		String str="abbaacc";
		System.out.println("old string is = "+str);
		System.out.println("New string is = "+removeDuplicatechar(str));	
	
	}

	public static void reverseString() {
		String str = "Ashish1234";
		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

	public static void reversArray() {

		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Before ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("After ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static String removeDuplicatechar(String str) {

		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (newStr.indexOf(ch) == -1) {
				newStr = newStr + ch;
			}
		}
		return newStr;
	}

	

}
