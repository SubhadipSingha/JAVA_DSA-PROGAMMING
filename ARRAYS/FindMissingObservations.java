package ARRAYS;

import java.util.Arrays;

public class FindMissingObservations {
   
   
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int arr[] =new int[n]  , nsum = 0 , Total =  mean * (n + rolls.length) , osum = 0;
        for (int r = 0 ;  r < rolls.length ; r++) {
           nsum +=  rolls[r] ;
        }
       int missing = Total - nsum;
        
        if(missing < n || missing > 6 * n){
            return new int[0];
        }

        int base = missing / n ;
        int r = missing % n ;
        for (int i = 0; i < n; i++) {
            arr[i] = base + ( i < r ? 1 : 0 );
        }

        return arr;
        
    }
   
    public static void main(String[] args) {
       int rolls[] = {1,5,6}, mean = 3, n = 4;
       System.out.println(Arrays.toString(missingRolls(rolls, mean, n)));
    }
}
