package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMisMatch {
     public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int low = nums[0] , high = nums[nums.length-1];
        int count = 0;

        for(int i = low ; i< high; i++){
           list.add(i);
        }
        for(int i = 0 ; i< nums.length; i++){
           if(nums[i] != list.get(i)){
              count++;
           }
        }
        int[] arr= new int[count];
        for(int i = 0 ; i< nums.length; i++){
            if(nums[i] != list.get(i)){
               arr[i] = list.get(i);
            }
         }

      return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
