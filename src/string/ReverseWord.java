package string;

public class
ReverseWord {

    public static void main(String[] args) {

        String str = "Hello World";

        String [] words = str.split(" ");

        String reversedStr = "";

        for(int i= words.length-1;i>=0;i--){
            reversedStr += words[i];
            if(i>0){
                reversedStr += " ";
            }
        }
         System.out.println(reversedStr);

        reverseWordUsingSB(str);
    }

    private static void reverseWordUsingSB(String str){
        StringBuilder sb = new StringBuilder();
       String [] word = str.split("\\s");
        for(int i= word.length-1;i>=0;i--){
            sb.append(word[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

}
