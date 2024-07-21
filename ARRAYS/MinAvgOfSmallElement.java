package ARRAYS;

import java.util.Arrays;

public class MinAvgOfSmallElement {
    public static double CheckOut(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        double[] arr = new double[n/2];
        int idx = 0;
        while(n>1){
            int MAX = nums[0];
            int Min =  nums[n-1];
            arr[idx++] = (MAX + Min )/2.0;
            nums = Arrays.copyOfRange(nums, 1, n-1);
            n-=2;
        }
        
       
        double MinAvg = Double.MAX_VALUE;
        for (int i = 0; i < idx; i++) {
            if(arr[i]<MinAvg){
                MinAvg = arr[i];
            }
        }
        return MinAvg;
        
    } 
    public static void main(String[] args) {
        int[] ns = {7,8,3,4,15,13,4,1};
        System.out.println((CheckOut(ns)));
    }
}
