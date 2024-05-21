package Interview_Coding;

public class Reverse_Array {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        getReverse(originalArray);
    }

    public static void getReverse(int[] arr) {

        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        System.out.print("Reverse of array :: ");
        for (int i : revArr) {
            System.out.print(i + " ");
        }
    }

}
