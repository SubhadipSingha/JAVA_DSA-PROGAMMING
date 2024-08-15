package FRAMEWORK_COLLECTION.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {

    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3 && !list.contains(key)) {
                list.add(key);
            }
        }
        
        return list;
        
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,2,3};
        System.out.println(majorityElement(nums));
    }
}
