package ARRAYS;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumberIII {
 
    public static int[] singleNumber(int[] nums) {
      int ans[] = new int[2];
      HashMap<Integer , Integer> map = new HashMap<>();
      for (int n : nums) {
          map.put(n , map.getOrDefault(n, 0)+1);
          

      }
      int i = 0;
      for (int k : map.keySet()) {
       
            if(map.get(k)!=2) {
                ans[i] = k;
                i++;
                if( i == 2){
                    break;
                 }
            }
         
      }
        return ans;
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(nums)));;
    }
}
