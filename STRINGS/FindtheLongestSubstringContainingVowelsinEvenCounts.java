package STRINGS;

import java.util.HashMap;

public class FindtheLongestSubstringContainingVowelsinEvenCounts {

        public static int findTheLongestSubstring(String s) {
           int n = s.length() , 
           mask = 0, maxlength = 0;
           HashMap<Integer ,Integer> map = new HashMap<>();
           for (int i = 0; i < n; i++) {
               char c = s.charAt(i);
               switch(c){
                case 'a'->mask ^= (1<<0);
                case 'e'->mask ^= (1<<1);
                case 'i'->mask ^= (1<<2);
                case 'o'->mask ^= (1<<3);
                case 'u'->mask ^= (1<<4);
               }
               if(map.containsKey(mask)){
                maxlength = Math.max(maxlength, i - map.get(mask));
               }else{
                map.put(mask , i);
               }
           }

           return maxlength;
        }
    

    public static void main(String[] args) {
        System.out.println(findTheLongestSubstring("eleetminicoworoep"));
    }
}
