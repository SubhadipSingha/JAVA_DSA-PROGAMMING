package STRINGS;

import java.util.Arrays;

public class MaximumGap {
    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        
        return 0; 
    }
    public static void main(String[] args) {
        int nums[] = {3,6,9,1};
        System.out.println(maximumGap(nums));   
    }
}
