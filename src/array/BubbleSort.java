package array;

public class BubbleSort {


    public static void bubbleSorting(int [] arr){
        //Using Bubble sort for int Array
        for(int i=0;i<arr.length;i++){
            int temp;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void bubbleSortingForString(String [] arr){
        //Using Bubble sort for String Array
       for(int i=0;i<arr.length;i++){
           String temp;
           for(int j=0;j<arr.length-1-i;j++){
               if(arr[j].compareTo(arr[j+1])>0){
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
               }
           }
       }

       for(int i=0;i<arr.length;i++){
           System.out.print(" "+arr[i]);
       }
    }

    public static void main(String[] args) {

        int [] arr ={12,2,4,345,13,23,78,4};
        String [] arr1 ={"Rahul","Ashish","Don","Vijay","Deepak"};
        bubbleSorting(arr);
        bubbleSortingForString(arr1);

    }


}
