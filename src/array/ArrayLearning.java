package array;

/*
    - An array is a collection of items of the same variable type that are stored at contiguous memory locations.
    - It’s one of the most popular and simple data structures and is often used to implement other data structures.
    - Each item in an array is indexed starting with 0 .
    - Each element in an array is accessed through its index.
*/
public class ArrayLearning {

    public static void main(String[] args) {

        int [] arr = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for(int array : arr){
            System.out.println(array);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Using basic for loop "+arr[i]);
        }

    }
}
