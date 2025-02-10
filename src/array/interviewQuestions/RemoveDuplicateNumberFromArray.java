package array.interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumberFromArray {

    private static void removeDuplicateArray(int [] arr){

        Set<Integer> s = new HashSet<>();
        for(int num : arr){
            if(s.add(num)){
                System.out.print(num + " ");
            }
        }

    }
    private static void removeDuplicateString(String [] str){

        Set<String> s = new HashSet<>();
        for(String string : str){
            if(s.add(string)){
                System.out.print(string + " ");
            }
        }

    }

    public static void main(String[] args) {

        int [] arr= { 12,4,11,12,4,2,45,67,67,45,1,3,4,5,6,6,7 };
        Arrays.sort(arr);

        String [] strArr = {"Ashish", "Ashish", "Rajat", "Vishal", "Raj", "Raj" };
        Arrays.sort(strArr);

        removeDuplicateArray(arr);
        removeDuplicateString(strArr);
    }
}
