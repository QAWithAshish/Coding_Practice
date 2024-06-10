package array;

public class FindMinAndMaxFromArray {

    public static void main(String[] args) {
        int [] arr= {12122,2,12,356,443,3456,3};
        int maxValue = isMax(arr);
        int minValue = isMin(arr);
        System.out.println("Max value => "+maxValue);
        System.out.println("Min value => "+minValue);
        
        System.out.println("Sum of min and max =>"+ (maxValue+minValue));
    }
    public static int isMax(int [] arr){
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int isMin(int [] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
