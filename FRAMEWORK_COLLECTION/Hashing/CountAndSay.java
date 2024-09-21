package FRAMEWORK_COLLECTION.Hashing;

import java.util.*;

public class CountAndSay {
    public static String CountTheNumber(int n){
        String ans = "";
        HashMap<Integer , Integer> map = new HashMap<>();
        while( n > 0){
          n--;

           map.put(1,map.getOrDefault(1, 0)+1);
           ans+=map.get(1);
        }
        
        return ans;
    }
    


    public static void main(String[] args) {
        int n = 4;
        System.out.println(CountTheNumber(n));
    }
}
