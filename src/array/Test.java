package array;

public class Test {

    public static void main(String[] args) {

        int[] arr = {123, 244, 1123, 332, 12};
        int maxValueIs = isMax(arr);
        int minValueIs = isMin(arr);
        System.out.println("Max => " + maxValueIs);
        System.out.println("Min => " + minValueIs);
    }

    public static int isMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int isMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
