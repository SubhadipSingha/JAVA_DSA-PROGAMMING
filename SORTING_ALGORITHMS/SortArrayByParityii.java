package SORTING_ALGORITHMS;

import java.util.Arrays;

public class SortArrayByParityii {
    public static int[] sortArrayByParity(int[] nums) {
        int n  = nums.length , evenindex = 0 , oddindex = 1;
        int[] result = new int[n];
        for(int num:nums){
            if(num%2==0){
                result[evenindex] = num;
                evenindex+=2; 
            }else if(num%2==1){
                result[oddindex] = num;
                oddindex+=2; 
            }

        }   
               
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,1,6};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
