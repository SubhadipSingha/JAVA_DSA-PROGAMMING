package STRINGS;

import java.util.List;

public class StringMatchingInAnArray {
    public static List<String> stringMatching(String[] words) {
       int minlen = Integer.MAX_VALUE;
      
       for(String w: words){
            minlen = Math.min(minlen ,w.length());
        }
        System.out.println(minlen);
      
        return null;
        
    }

    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));
    }
}
