package array.interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesIntArrayOrStringArray {

    private void getIntArr(int [] intArray){
        Set<Integer> s = new HashSet<>();
        for(int i: intArray){
            if(!s.add(i)){
                System.out.print(i+" ");
            }
        }
    }
    private void getStringArr(String [] stringArray){
        Set<String> s = new HashSet<>();
        for(String str: stringArray){
            if(!s.add(str)){
                System.out.print(str+" ");
            }
        }
    }
    public static void main(String[] args) {


        int [] intArr = {12,4,11,12,4,2,45,67,67,45,1,3,4,5,6,6,7};

        String [] strArr= {"apple" , "banana" , "mango" , "apple" , "mango" , "orange" };

        PrintDuplicatesIntArrayOrStringArray print= new PrintDuplicatesIntArrayOrStringArray();

        print.getIntArr(intArr);

        print.getStringArr(strArr);

    }
}
