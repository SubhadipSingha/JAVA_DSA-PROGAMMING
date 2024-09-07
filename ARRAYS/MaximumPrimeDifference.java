package ARRAYS;
public  class MaximumPrimeDifference{
    public static int maximumPrimeDifference(int[] nums) {
      int ans = 0 , n = nums.length, max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;   
        for (int i = 0; i < n; i++) {
            if(checkPrime(nums[i])){
                min = Math.min(min , i);
                max = Math.max(max, i);
               
            }
        }
        ans  = max - min;
        return ans;
    }
    
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int nums[] = {4,2,9,5,3};
        System.out.println(maximumPrimeDifference(nums));  // Output should be 3 - 1 = 2
    }
}    