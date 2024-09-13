package FRAMEWORK_COLLECTION.Hashing;

import java.util.HashMap;

public class CountSubstringsStartingandEndingwithGivenCharacter {

     public static long countSubstrings(String s, char c) {
        HashMap<Character , Integer> map = new HashMap<>();
        long ans = 2;
        for(char v : s.toCharArray() ){
            map.put(v , map.getOrDefault(c , 0)+1);
        }
        for (char k : map.keySet()) {
           if( k == c){
             long v = map.get(k);
              ans *= v;
            }
        }
        return ans;
    }

   public static void main(String[] args) {
    System.out.println(countSubstrings("ababa", 'a'));
   }
}
