package string;

public class ReverseString {

	//Java Program to reverse a string without using String inbuilt function
	public static void reverseString() {
		String str = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println(str2);
	}
	public static void main(String[] args) {

		// 1 Using + (String Concatenation ) Operator
		String str = "ABCD";
		String rev ="";

	
		int len = str.length(); // 4

		for (int i = len - 1; i >= 0; i--) //3 2 1 0 -1
		{
			rev = rev + str.charAt(i); // DCBA
		}
		
		/*
		//2 By using Character Array
		
		char a[]=str.toCharArray();
		int len=a.length; //4
		
		for(int i=len-1;i>=0;i--)  //3 2 1
		{
			rev=rev+a[i];  //DCBA
		}
		
		
		//3 By using StringBuffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Reverse String is = "+sb.reverse());
		*/
		System.out.println("Reverse String is = "+rev);
		ReverseString.reverseString();
	}

}
