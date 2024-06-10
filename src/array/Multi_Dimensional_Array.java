package array;

import java.util.Arrays;

/*
    - A multi-dimensional array is an array of arrays. The most commonly used multi-dimensional array is a 2D array.
*/
public class Multi_Dimensional_Array {

    public static void main(String[] args) {
        int[][] multiArray = new int[3][3];
        multiArray[0][0] = 1;
        multiArray[0][1] = 5;
        multiArray[0][2] = 3;
        multiArray[1][0] = 2;
        multiArray[1][1] = 6;
        multiArray[1][2] = 7;
        multiArray[2][0] = 8;
        multiArray[2][1] = 9;
        multiArray[2][2] = 8;

        for(int i=0;i<multiArray.length;i++){
            for(int j=0;j< multiArray.length;j++){
                System.out.print(multiArray[i][j]+" ");
            }
            System.out.println();
        }

        getMultiDimensional();
    }

    public static void getMultiDimensional(){
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Multi-Dimensional Array:");
        for (int[] row : multiArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
