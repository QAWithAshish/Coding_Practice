package pattern;

public class Pattern_Print {

    //Print right half pyramid

    public static void main(String[] args) {

        int num=5;
        for(int i=1 ; i<=num;i++){

            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }


       /* System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");*/

    }
}
