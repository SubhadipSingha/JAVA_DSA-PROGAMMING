package ARRAYS;



public class TwoSumProblem {
    public static int[] twosum(int[] nums,int target){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] + nums[j] == target ){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{};
        
    }

    public static void main(String[] args) {
        int[] nums = {0,1,3,9,4};
        int target = 10;
        int[] result = twosum(nums,target);
    
        for(int i = 0; i<result.length;i++){
            System.out.print(" "+result[i]);
        }
    }
 }
