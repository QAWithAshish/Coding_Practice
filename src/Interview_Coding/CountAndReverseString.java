package Interview_Coding;

public class CountAndReverseString {

    public static String email="Ashish14234bhalray@gmail.com";
    public static String rev="";
    public static int len=email.length();


    public static void reverseString(String rev, String email){
        for(int i=len-1;i>=0;i--){
            rev+=email.charAt(i);
        }
        System.out.println("Reverse String :: "+rev);
    }

    public static void countNumberFromOfString(int count ,String email){
        for(char c : email.toCharArray()){
            if(Character.isDigit(c)){
                count+=Character.getNumericValue(c);
                //count =count+Character.getNumericValue(c);
            }
        }
        System.out.println("Digit count from String :: "+count);
    }
    public static void verifyPalindromeString(String email,String rev){
        if(rev.equals(email)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not Palindrome String");
        }

    }

    public static void main(String[] args) {

        reverseString(rev ,email);
        countNumberFromOfString(0,email);
        verifyPalindromeString(email,rev);
    }
}
