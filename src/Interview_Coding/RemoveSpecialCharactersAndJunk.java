package Interview_Coding;

public class RemoveSpecialCharactersAndJunk {

    public static void main(String[] args) {
        String input  = "!@$5Follow Code Yatra";
        String output = removeSpecialCharacters(input);
        System.out.println(output);

    }
    public static String removeSpecialCharacters(String input){
        return input.replaceAll("[^a-zA-Z0-9 ]" ,"");
    }
}
