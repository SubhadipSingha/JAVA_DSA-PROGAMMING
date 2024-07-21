package ARRAYS;

public class MaximumOcurrenceInTheArray {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int o = 0;
        // int c1 = 0;
        // int c2=0;
        for(int i=0;i<n;i++){
            if(nums[i] == nums[n-1-i] ){
             o = nums[i];
            }else if(nums[i+1] == nums[n-1-i]){
               o= nums[i+1];
            }
        }
       return o;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        
        System.out.println(majorityElement(nums));
    }
}

