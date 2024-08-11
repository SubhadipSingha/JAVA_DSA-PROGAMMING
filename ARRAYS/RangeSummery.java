package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class RangeSummery {
     public static List<String> summaryRanges(int[] nums) {
        List<String> range = new ArrayList<>();
        if (nums.length == 0) {
            return range;
        }
        
        int start = nums[0];
        for (int i = 0; i < nums.length; i++) {
         
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                if (start == nums[i]) {
                    range.add(String.valueOf(start));
                } else {
                    range.add(start + "->" + nums[i]);
                }
                
                if (i != nums.length - 1) {
                    start = nums[i + 1];
                }
            }
        }
        
        return range;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }
}
