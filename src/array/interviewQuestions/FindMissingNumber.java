package array.interviewQuestions;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = 5;
        System.out.println("Missing number is :: " + findMissingNumber(arr, n));
    }

    public static int findMissingNumber(int[] arr, int n) {

        int expectSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        return expectSum - actualSum;
    }
}
