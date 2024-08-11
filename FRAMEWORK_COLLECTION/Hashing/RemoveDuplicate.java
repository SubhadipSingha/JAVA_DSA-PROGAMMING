package FRAMEWORK_COLLECTION.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        
            if (map.get(nums[i]) < 3) {
                resultList.add(nums[i]);
            }
        }
        int[] ans = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            ans[i] = resultList.get(i);
        }
        // for (int idx = 0; idx < ans.length; idx++) {
        //    System.out.print(ans[idx]+" ");
            
        // // }
        // System.out.println("");
        return ans.length;
        
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println((removeDuplicates(nums)));
    }
}
