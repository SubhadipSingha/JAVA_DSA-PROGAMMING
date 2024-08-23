package STRINGS;

import java.util.ArrayList;
import java.util.List;

public class CheckIfAStringIaAnAcronymOfWords {
    
    public static boolean isAcronym(List<String> words, String s) {
       if( words.size() != s.length()){
         return false;
       }
       for (int i = 0; i < words.size(); i++) {
           if(s.charAt(i) != words.get(i).charAt(0)){
            return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("piiyodecdf","wdwfxsjfou"));
        String s= "pp";
        System.out.println(isAcronym(list, s));
    }
}
