package javaProgrames;

import java.util.Scanner;

public class NewSwitchCase {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Your case :: ");
        int day = sc.nextInt();
         newSwitch(day);


    }


    public static void newSwitch(int day){
        String output = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";

        };
        System.out.print("case output is :: "+output);
    }

}
