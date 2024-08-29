package ARRAYS;

import java.util.Arrays;

public class SpecialArrayi {
    public static void main(String[] args) {
       int nums1[] = {2,6,4}, nums2[] = {9,7,5} , max1 = Integer.MIN_VALUE , max2 = Integer.MIN_VALUE;
       Arrays.sort(nums1 ); Arrays.sort(nums2);
        for(int n : nums1){
            max1= Math.max(max1, n);
        }
        for(int n : nums2){
            max2= Math.max(max2, n);
        }
        System.out.println(max2 - max1);

    }
}
