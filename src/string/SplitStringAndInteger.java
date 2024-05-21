package string;

public class SplitStringAndInteger {
    public static void main(String[] args) {
        String a = "As14ish11Bhalray19";
        int i;
        String str1="";
        String str2="";
        for(i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if( '0' <= c && c <= '9' )
                str1=str1+c;
            if( 'a' <= c && c <= 'z' )
                str2=str2+c;
        }
        System.out.println(str1);
        System.out.println(str2);
    }
}
