package FRAMEWORK_COLLECTION.Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterSectionOfArray {
    public static int[]  intersection(int[] nums1, int[] nums2) {
       Set<Integer> set = new HashSet<>();
       Set<Integer> inter  = new HashSet<>();
       for(int num : nums1){
        set.add(num);
       }
       for(int num : nums2){
        if(set.contains(num)){
            inter.add(num);
        }
       }
       int[] result = new int[inter.size()];
      int i = 0;
      for(int num : inter){
        result[i++] = num;
      }
       return result;
      
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
