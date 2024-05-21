package string;

public class ReversEachWord {

	public static void main(String[] args) {
		
		String str="Hello My Name is Ashish";
		
		String[] word = str.split(" ");
		
		String reversString="";
		
		for(String w: word) {
			
			String reversWord="";
			
			for(int i=w.length()-1;i>=0;i--) {
			
				reversWord=reversWord+w.charAt(i);
			}
			reversString=reversString+reversWord+" ";
		}
		System.out.println(reversString);
	}

}
