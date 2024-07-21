package ARRAYS;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
       
         int last = nums.length;
         int  Esum  = last * (last + 1) /2;
         int  Asum =0;
        for(int num : nums){
            Asum += num; 
        }
      return Esum - Asum;
    }
    public static void main(String[] args) {
        
        int[] nums ={3,2,0};
        System.out.println((missingNumber(nums)));
    }
}
