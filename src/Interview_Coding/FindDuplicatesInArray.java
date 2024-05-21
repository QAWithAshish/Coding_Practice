package Interview_Coding;

public class FindDuplicatesInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 3, 6, 2};

        System.out.println("Duplicate elements:");
        findDuplicates(array);
    }

    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] +" ");
                }
            }
        }
    }
}
