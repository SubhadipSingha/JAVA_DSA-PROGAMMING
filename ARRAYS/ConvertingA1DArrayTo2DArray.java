package ARRAYS;

import java.util.Arrays;

public class ConvertingA1DArrayTo2DArray {
   
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] newarr = new int[m][n] ;
        for(int i = 0 ; i < m ; i++){
            for (int j = 0; j < n ; j++) {
                newarr[i][j] = original[n*i+j];
            }
        }

        
        for(int i = 0 ; i < m ; i++){
            for (int j = 0; j < n ; j++) {
                System.err.print(newarr[i][j]+" ");
            }
            System.out.println("");
        }
         return  newarr;
        
    }
   
    //another way to this 
    public static int[][] Convert(int[] original, int m, int n){
        int[][] newArray = new int[m][];
        switch( m*n == original.length ? 1 : 0){
            case 1: 
            int i = 0 ;
            while( i < m){
                newArray[i] = Arrays.copyOfRange(original , i* n , i * n + n);
                i++;
            }
            break;
            default : 
            return new int[0][0];
        }
        return newArray;
        
    }
    public static void main(String[] args) {
        int[] original = { 1 , 2 };

    System.err.println( Arrays.deepToString(construct2DArray(original, 1, 1)));
    System.err.println( Arrays.deepToString(Convert(original, 1, 1)));
    }
}
