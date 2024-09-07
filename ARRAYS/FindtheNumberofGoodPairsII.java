package ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class FindtheNumberofGoodPairsII {
    public static long numberOfPairs(int[] nums1, int[] nums2, int k) {
        int  count = 0 ;
        for (int n1 : nums1) {
            for (int n2 : nums2) {
               if( n1 % (n2 * k) == 0 ) count++;
            } 
        }
        
        
        return count;
        
    }
    public static long numberOfPairsoptimize(int[] nums1, int[] nums2, int k){
          Map<Integer, Integer> map = new HashMap<>();
        long cnt = 0;
        for (int num : nums2) {
            int value = num * k;
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for (int num : nums1) {
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    if (map.containsKey(i)) {
                        cnt += map.get(i);
                    }
                    if (i != num / i && map.containsKey(num / i)) {
                        cnt += map.get(num / i);
                    }
                }
            }
        }

        return cnt;
    } 
    public static void main(String[] args) {
        int  nums1[] = {1,2,4,12}, nums2[] = {2,4}, k = 3;
        System.out.println(numberOfPairs(nums1, nums2, k));
        System.out.println(numberOfPairsoptimize(nums1, nums2, k));
    }
}
