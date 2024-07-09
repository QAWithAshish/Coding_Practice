package string;

public class SortString {

    public static void main(String[] args) {

        String str = "zero";

        String sortedString = sortString(str);
        System.out.println(sortedString);

    }

    public static String sortString(String str) {
        char[] arr = str.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] > arr[j]){
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return new String(arr);
    }
}
