package FRAMEWORK_COLLECTION.Hashing;

import java.util.HashMap;

public class CountSubstringsStartingandEndingwithGivenCharacter {

     public static long countSubstrings(String s, char c) {
        HashMap<Character , Integer> map = new HashMap<>();
        long ans , v= 0;
        for(char k : s.toCharArray() ){
            map.put(k , map.getOrDefault(c , 0)+1);
              if(k == c){
                v = map.get(k);
                }
        }
        ans = v * (v+1)/2 ;
        return ans;
    }

   public static void main(String[] args) {
    System.out.println(countSubstrings("ababa", 'a'));
   }
}
