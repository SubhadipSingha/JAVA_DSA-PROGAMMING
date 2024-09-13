package STRINGS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    
    public static boolean  wordBreak(String s, List<String> wordDict) {
     
      Set<String> Wordset = new HashSet<>(wordDict);
      boolean[] check = new boolean[s.length()+1];
      check[0] = true;
      for (int i = 0; i <= s.length(); i++) {
          for (int j = 0; j < i; j++) {
            System.out.println("i: "+i+"j: "+j);
            if(check[0] && Wordset.contains(s.substring(j, i))){
                check[i] = true;
                System.out.println(s.substring(j, i));
                break;
            }
              
          }
      }

       return check[s.length()];
        
    }

    public static void main(String[] args) {
        String s = "catsandog";
        List<String> wordDict = new ArrayList<>(List.of("cats","and","dog"));
        System.out.println(wordBreak(s, wordDict));
    }
}
