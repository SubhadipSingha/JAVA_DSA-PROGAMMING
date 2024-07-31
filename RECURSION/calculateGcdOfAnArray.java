package RECURSION;

import java.util.Arrays;

class CalculateGcdOfAnArray {
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0] , b = nums[nums.length-1];
        int ans = Gcd(a,b);
        return ans;
    }
    private static int Gcd(int a,int b) {
        if(b==0){
            return a;
        }
        return Gcd(b,a%b);
    }
    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }
}