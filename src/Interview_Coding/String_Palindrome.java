package Interview_Coding;

import java.util.Scanner;

public class String_Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string :: ");
        String str = sc.nextLine();
        String rev="";

        int len =str.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse of the string is :: "+rev);

        if(str.equals(rev)){
            System.out.println("String is Palindrome string ");
        }else{
            System.out.println("String is not a Palindrome string ");
        }
    }
}
