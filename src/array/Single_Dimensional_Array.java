package array;

/*
    - A single-dimensional array is a list of elements, all of the same type, accessed by a single index.
*/
public class Single_Dimensional_Array {

    public static void main(String[] args) {

        int [] singleArray = new int [5];
        singleArray[0] = 10;
        singleArray[1] = 50;
        singleArray[2] = 30;
        singleArray[3] = 40;
        singleArray[4] = 20;

        for(int i=0;i<singleArray.length;i++){
            System.out.println(singleArray[i]);
        }
    }
}
