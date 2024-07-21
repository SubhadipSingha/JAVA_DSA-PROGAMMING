package ARRAYS;

public class SmallestRangeofI {

    public static int FindOut(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
      
      for(int i = 0;i<nums.length;i++){
       
       min = Math.min(min,nums[i]);
       max = Math.max(max,nums[i]);
       }
  if((min+k) >= (max - k)){
          return 0;
      }
  return ((max-k)-(min+k));
}

  public static void main(String[] args) {
    int[] nums = {1, 3, 6};
    int k = 3;
    System.out.println(FindOut(nums, k)); 
  }
}
