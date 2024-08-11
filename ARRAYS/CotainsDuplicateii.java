package ARRAYS;


import java.util.HashMap;
import java.util.Map;

public class CotainsDuplicateii {
    public  static boolean containsNearbyDuplicate(int[] nums, int k) {
      
       
        Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) {
      int current = nums[i];
        if (map.containsKey(current)) {
            int j = map.get(current);
            if (Math.abs(i - j) <= k) {
                return true;
            }
        }
        map.put(current, i);
    }

    return false;

     }
     public static void main(String[] args) {
        int[] nums = {1,1} ;
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));

     }
}
