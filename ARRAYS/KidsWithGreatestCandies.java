package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int Max = Integer.MIN_VALUE;
        for (int n : candies) {
            Max = Math.max(Max, n);
        }
        
        for (int n : candies) {
            if(n + extraCandies >= Max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
        
    }
    public static void main(String[] args) {
       int candies[] ={2,3,5,1,3} ,extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
