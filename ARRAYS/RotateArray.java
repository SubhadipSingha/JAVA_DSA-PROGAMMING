package ARRAYS;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
  
        int index = nums.length;
        int idx = 0;
        for(int i=0;i<k+2;i++){
            arr[i] = nums[index-1];
            index--;
            
        }
        for (int j = k+1; j < nums.length; j++) {
            arr[j] = nums[idx];
            idx++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
    }
}
