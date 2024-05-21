package string;

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
	public static void main(String[] args) {
		
		String str="abbaaccscsdcd";
		System.out.println("old string is = "+str);
		System.out.println("New string is = "+removeDuplicatechar(str));

	}

}
