package Java_8;

public class ReverseStringUsingSB {

    public static void reverseUsingStringBuilder(String string){
        StringBuilder sb= new StringBuilder(string);
        String reverseStr = sb.reverse().toString();
        System.out.println("Reverse String is = "+reverseStr);
    }

    public static void reverseUsingStringBuffer(String string){
        StringBuffer sb=new StringBuffer(string);
        System.out.println("Reverse String is = "+sb.reverse());
    }

    public static void main(String[] args) {

        reverseUsingStringBuilder("Ashish");
        reverseUsingStringBuffer("Hello");


        //Hard coded

      /*  String str = "Ashish";
        int len = str.length();
        String rev = "";

        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);*/


    }
}
