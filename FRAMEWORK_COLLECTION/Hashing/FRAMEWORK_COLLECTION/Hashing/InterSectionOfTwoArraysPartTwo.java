package FRAMEWORK_COLLECTION.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InterSectionOfTwoArraysPartTwo {
    public static int[]  intersection(int[] nums1, int[] nums2) {
       HashMap<Integer, Integer> map = new HashMap<>();
       List<Integer> Interset = new ArrayList<>();

       for(int num : nums1){
        map.put(num , map.getOrDefault(num, 0)+1);
       }
       for(int num : nums2){
        if(map.containsKey(num) && map.get(num)>0){
            Interset.add(num);
            map.put(num ,map.get(num)-1);
        }
       }
       int[] result = new int[Interset.size()];
       for(int i = 0; i<result.length;i++){
        result[i] = Interset.get(i);
       }
        
       return result;
   
      
    }
    
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
       System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
