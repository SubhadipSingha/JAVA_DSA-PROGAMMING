package ARRAYS;

public class MinAvgDifference {
    public static  double minimumAverageDifference(int[] nums) {
       int sum = 0 ;
        for(int n: nums){
            sum+=n;
        }
        double avg =  Math.floor(sum / nums.length);
        return avg;
        
    }
    public static void main(String[] args) {
        int[] nums = {2,5,3,9,5,3};
        System.out.println(minimumAverageDifference(nums) );
    }
}
