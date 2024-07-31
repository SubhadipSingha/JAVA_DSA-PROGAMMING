package ARRAYS;

import java.util.HashMap;


public class NumberGoodPairs {
    
        public static  int numIdenticalPairs(int[] nums) {
           int ans = 0;
           HashMap<Integer,Integer> list = new HashMap<>();
           for(int n:nums){
            int count = list.getOrDefault(n, 0);
            System.out.println("count :"+count+" for "+n);
            ans += count;
            System.out.println("ans :"+count);
            list.put(n, count+1);
           }
           
            return ans ;
        }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
}
