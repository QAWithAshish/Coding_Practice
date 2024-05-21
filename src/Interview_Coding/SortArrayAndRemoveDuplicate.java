package Interview_Coding;

public class SortArrayAndRemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 2, 1, 3};
        //sortAndRemoveDuplicates(arr);

        for(int i=0;i<arr.length;i++){
            int temp;
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //To remove duplicate
        int [] tempArr= new int [arr.length-1];

        int j=0;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                tempArr[j++]=arr[i];

            }
        }
        tempArr[j++]=arr[arr.length-1];

        //To print sorted and unique array
        for(int k=0;k<j;k++){
            System.out.print(tempArr[k] +" ");
        }

    }
































    public static void sortAndRemoveDuplicates(int [] arr){
        // Sort the array using bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        // Remove duplicates
        int[] uniqueArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueArr[j++] = arr[i];
            }
        }
        uniqueArr[j++] = arr[arr.length - 1];


        // Print the sorted and duplicate-free array
        System.out.print("Sorted and duplicate-free array: ");
        for (int k = 0; k < j; k++) {
            System.out.print(uniqueArr[k] + " ");
        }

    }
}
