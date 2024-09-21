package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class ReachEndofArrayWithMaxScore {
    
    public static long findMaximumScore(List<Integer> nums) {
        long maxscore = 0  , res = 0;
        for(int n : nums){
            res +=maxscore;System.out.println(n+"\t"+maxscore+"\t"+res);
            
            maxscore = Math.max(maxscore, n);
            
        } 
        
        return res;
        
        
    }


    public static void main(String[] args) {
      List<Integer> list = new  ArrayList<>(List.of(1,3,1,5));
      System.out.println(findMaximumScore(list));
    }
}
