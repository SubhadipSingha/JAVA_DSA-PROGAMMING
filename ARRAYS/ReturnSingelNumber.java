package ARRAYS;

public class ReturnSingelNumber {
    public static int Singelnumber(int[] nums){
        int Snum = 0;
        for(int i=0;i<nums.length;i++){
                Snum ^=  nums[i];
        }
        return Snum;
        
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int result = Singelnumber(nums);
            System.out.println(result);
    }
}
