package FRAMEWORK_COLLECTION.Hashing;

import java.util.Hashtable;

public class longestReaptingSubString {
    public static int lengthOfLongestSubstring(String s) {
       Hashtable<Character, Integer> table = new Hashtable<>();
       char[] ch = s.toCharArray();
      String ans  = "";
       for(int i = 0 ; i< ch.length ; i++ ){
         table.put(ch[i], table.getOrDefault(ch[i], 0)+1);
        
         
       }
       for (char c : table.keySet()) {
        if(table.get(c) > 1){
            ans+=c;
         }
       }
     
       System.out.println(ans);
        return ans.length();
        
    }
    
    
    
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
