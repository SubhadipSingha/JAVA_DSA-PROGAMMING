package ARRAYS;

import java.util.Arrays;

public class XORQueriesofaSubarray {
   
    public static int[] xorQueries(int[] arr, int[][] queries) {
       int ans[] = new int[arr.length];
        for(int q = 0 ; q < queries.length ; q++){

            int fidx =queries[q][0];
            int lidx =queries[q][1];

            int xor = arr[fidx];
            for (int i = fidx +1; i <= lidx; i++) {
                xor ^= arr[i];
            }
            ans[q] = xor;
        }
       
       
       
        return ans;
        
    }
   
    public static void main(String[] args) {
        int arr[] = {1,3,4,8}, queries[][] = {{0,1},{1,2},{0,3},{3,3}};
        System.out.println(Arrays.toString(xorQueries(arr, queries)));
    }
}
