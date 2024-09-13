package STRINGS;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
   
    public static String largestNumber(int[] nums) {
        StringBuilder ans = new StringBuilder();
        String[] numString = new String[nums.length];
      for (int i = 0  ; i< numString.length ;i++) {
          numString[i] = Integer.toString(nums[i]);
      }
      Arrays.sort(numString, new Comparator<String>(){
        
        public int compare(String a , String b){
            // System.out.println((a+b)+" "+(b+a));
            // System.out.println(Arrays.toString(numString));
            return (b+a).compareTo(a+b);
        }
      });
      if(numString[0].equals("0")) return "0";

      for (String w : numString) {
          ans.append(w);
      }
        return ans.toString();
        
    }
   
   
    public static void main(String[] args) {
        int  nums1[] = {3,30,34,5,9} , nums2[] = {10,2};
        System.out.println(largestNumber(nums1));
        System.out.println(largestNumber(nums2));
    }
}
