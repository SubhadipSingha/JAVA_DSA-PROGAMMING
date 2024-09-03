package FRAMEWORK_COLLECTION.Hashing;

import java.util.HashMap;

public class leastkDistanceBetween1 {
    public static boolean kLengthApart(int[] nums, int k) {
       HashMap<Integer , Integer> map = new HashMap<>();
       for (int n : nums) {
           map.put(n, map.getOrDefault(n, 0)+1);
       }
    //    System.out.println(map);

        return map.get(0) >= k && map.get(0) > map.get(1);
        
    }
    public static void main(String[] args) {
        int nums[] = {1,0,0,0,1,0,0,1}, k = 2;
        System.out.println(kLengthApart(nums, k));
    }
}
