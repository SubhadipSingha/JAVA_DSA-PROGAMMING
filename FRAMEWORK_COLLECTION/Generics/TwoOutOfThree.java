package FRAMEWORK_COLLECTION.Generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class TwoOutOfThree {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> list = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
      for(int num: nums1){
        list.add(num);
      }
       for(int num : nums2){
           if(list.contains(num) ){
              list1.add(num);
           }

       } 
       for(int num : nums3 ){
        if(list.contains(num) && !list1.contains(num)){
           list1.add(num);
        }

    } 
        
        
        return list1; 
    }
    public static void main(String[] args) {
        int[]  nums1 = {3,1}, nums2 = {2,3}, nums3 = {1,2};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }
}
