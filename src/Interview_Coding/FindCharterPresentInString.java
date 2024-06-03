package Interview_Coding;

import java.util.Scanner;

public class FindCharterPresentInString {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String here :: ");
        String string = sc.nextLine();
        isCharPresentInString(string);

    }

    public static void isCharPresentInString(String str) {

        char[] charToFind = {'h'};
        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            for (int j = 0; j < charToFind.length; j++) {

                if (charToFind[j] == eachChar) {
                    System.out.println("The String " + str + " Contains character " + charToFind[j] + " In the given string");
                }
            }

        }
    }
}
