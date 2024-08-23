package FRAMEWORK_COLLECTION.Generics;

import java.util.ArrayList;
import java.util.List;
public class CoutPairsWhoseSumLessThanTarget {
    
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        
        for (int i = 0 ; i < nums.size() ; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if( nums.get(i) + nums.get(j) < target){
                    count++;
                    System.out.println(count + " for this pair :\t"+ nums.get(i)+" "+ nums.get(j));
                }
            }
        }
        
        
        
        
        return count;
        
    }
    public static void main(String[] args) {
       List<Integer> list = new ArrayList(List.of(-1,1,2,3,1));
       int target = 2;
       System.out.println(countPairs(list, target));
    }
}
