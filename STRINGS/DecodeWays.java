package STRINGS;

import java.util.*;;


public class DecodeWays {

    public static int numDecodings(String s) {
        
        HashMap<Integer , Character > set = new HashMap<>();
       int key = 0;
        for (char i = 'a'; i < 'z'; i++) {
            set.put(key , i);
            key++;
        }
         int count = 0; 
         ArrayList<Character> values = new ArrayList<>();
         for (char c : s.toCharArray()) {
          int i = Character.getNumericValue(c);
            if(i > 0 && set.containsValue(c)){
            values.add(c) ;}
         }
         System.out.println(values);
       
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("06"));
    }
}
