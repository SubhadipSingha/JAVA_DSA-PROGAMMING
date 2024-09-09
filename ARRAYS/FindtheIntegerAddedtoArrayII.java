package ARRAYS;

import java.util.Arrays;

public class FindtheIntegerAddedtoArrayII {
    public static int minimumAddedInteger(int[] nums1, int[] nums2) {
       Arrays.sort(nums1); Arrays.sort(nums2);
        int ans = Integer.MAX_VALUE , n =nums2.length;
        for (int i = n; i < nums1.length; i++) {
            for (int j = 0; j < n; j++) {
                    ans = nums2[j] - nums1[i];
                
            }
            
        }
        return ans ;
    }
    public static boolean check(int nums1[], int nums2[], int x){
        
        int n = nums1.length;
        int m = nums2.length;
        
        int i=0, j = 0;
        
        while (i < n && j < m){
            if (nums1[i]+x == nums2[j]){
                j++;
            }
            i++;
        }
        
        return j==m;
    }
    
    public static int minimumAddedIntegereffective(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int ans = 100000;
        
        for(int i=0;i<3;i++){
            int x =nums2[0]-nums1[i];
            if(check(nums1,nums2, x)){
                ans = x;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int nums1[]={3,5,5,3}, nums2[]= {7,7};
        System.out.println(minimumAddedInteger(nums1, nums2));
    }
}
