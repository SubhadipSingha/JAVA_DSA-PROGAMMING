package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix {
   
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        for (int[] matrix1 : matrix) {
            // Find the minimum element in the row
            int minInRow = matrix1[0];
            int minIndex = 0;
            for (int j = 1; j < matrix1.length; j++) {
                if (matrix1[j] < minInRow) {
                    minInRow = matrix1[j];
                    minIndex = j;
                }
            }
            // Check if this minimum element is the maximum in its column
            boolean isMaxInColumn = true;
            for (int[] matrix2 : matrix) {
                if (matrix2[minIndex] > minInRow) {
                    isMaxInColumn = false;
                    break;
                }
            }
            if (isMaxInColumn) {
                list.add(minInRow);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[][]matrix  = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
}
