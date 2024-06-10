package Interview_Coding;

public class CountEvenAndOdd {
    public static void main(String[] args) {

        int num = 12346;
        int countEven = 0;
        int countOdd = 0;

        while (num > 0) {

            num = num / 10;
            if (num % 2 == 0)
                countEven++;
            else
                countOdd++;
        }
        System.out.println("Even Numbers :" + countEven);
        System.out.println("Odd Numbers : " + countOdd);

    }
}
