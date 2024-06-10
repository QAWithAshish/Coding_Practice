package array.interviewQuestions;

import java.util.*;
import java.util.Scanner;
class SumOFMinMax {
    public static void main(String[] args) {
        ArrayList <Integer> a =new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,1,3,8,2,3));
        while(arr.size()!=0){
            int max=0;
            int min =100000;
            int k=0;
            int m=0;
            for(int i=0; i<arr.size(); i++){
                if(max<arr.get(i)){
                    max=arr.get(i);
                    k=i;

                }
            }arr.remove(k);
            for(int i=0; i<arr.size(); i++){
                if(min>arr.get(i)){
                    min=arr.get(i);
                    m=i;
                }
            }
            arr.remove(m);
            System.out.println(max+" "+min);
            a.add(max+min);
        }
        System.out.println(a);
    }
}