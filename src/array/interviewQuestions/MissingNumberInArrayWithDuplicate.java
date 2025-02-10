package array.interviewQuestions;

public class MissingNumberInArrayWithDuplicate {

    public static void main(String[] args) {

        int [] input = {2,2,5,9,100,18,18,15,29};

        int [] copy = new int[101];

        for(int num : input){
            copy[num] =1;
        }
        for(int i=1;i<copy.length;i++){
            if(copy[i]==0){
                System.out.print(i +" ");
            }
        }
    }
}
