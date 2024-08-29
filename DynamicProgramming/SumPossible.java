package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SumPossible {
    
    public static Boolean possible(int amount , List<Integer> nums){
        return possible(amount, nums , new HashMap<>());
    }

    public static boolean possible(int amount , List<Integer> nums , HashMap<Integer , Boolean> map) {
        if( amount == 0) return true;
        if(amount < 0) return false;

        if(map.containsKey(amount)) return map.get(amount);
        for(int n : nums){
        int sub = amount - n;
        if(possible(sub, nums , map)){
            map.put(amount, true);
            System.out.println(sub);
          return true;
        }
    
       }
       map.put(amount , false);
       return false;
    }    
    
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3 ,4 ,5,5,6,90,34,56));
        System.out.println(possible(40, list));
    }
}
