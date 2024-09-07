package ARRAYS;

import java.util.Arrays;

public class AverageWaitingTime{
    public static double averageWaitingTime(int[][] customers) {
       double avgTime = 0;
       int[] Avg = new int[customers.length];
       int idx = 0;int end = 0;
       for (int[] customer : customers) {
               int start = customer[0];
               end = Math.max(end , start) + customer[1];
               Avg[idx]  = end - start  ;
               idx++;
       }
       System.out.println(Arrays.toString(Avg));
       for (int A : Avg ) {
           avgTime += A;
       }
        return avgTime/customers.length;
        
    }
    public static void main(String[] args) {
        int customers[][] = {{1,2},{2,5},{4,3}};
        System.out.println(averageWaitingTime(customers));
    }
}