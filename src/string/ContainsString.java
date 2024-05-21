package string;

public class ContainsString {

    //WAP to check if string contains certain character or not

    public static void main(String[] args) {
        String str="ashish";

        char[] charToSearch={'a'};
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            for(int j=0; j<charToSearch.length; j++)
            {
                if(charToSearch[j] == ch)
                {
                    System.out.println("The String "+str + " contains the char " +charToSearch[j]);
                }
            }
        }

        }

    }

