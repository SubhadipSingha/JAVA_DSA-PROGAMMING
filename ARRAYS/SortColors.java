package ARRAYS;

import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
          for (int j = i+1; j < nums.length; j++) {
            int min = nums[i];
            if(min > nums[j]){
                int temp = min;
                nums[i] = nums[j];
                nums[j] = temp;
            }
          }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
     int nums[] = {2,0,2,1,1,0};
     sortColors(nums);
    }
}
