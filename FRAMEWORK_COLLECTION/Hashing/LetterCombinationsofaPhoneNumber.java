package FRAMEWORK_COLLECTION.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
 
    public static List<String> letterCombinations(String digits) {
        
        HashMap<Integer , String> map = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            switch (i) {
                case 0 -> map.put(i, " ");
                case 2 -> map.put(i, "abc");
                case 3 -> map.put(i, "def");
                case 4 -> map.put(i, "ghi");
                case 5 -> map.put(i, "jkl");
                case 6 -> map.put(i, "mno");
                case 7 -> map.put(i, "pqrs");
                case 8 -> map.put(i, "tuv");
                case 9 -> map.put(i, "wxyz");
                default -> {
                }
            }
        }

        List<String> list = new ArrayList<>();
        if(digits == null || digits.length() == 0) return list;
        
        generatecombination("", digits, 0, map, list);
        return list;
    }
    public static void generatecombination(String prefix , String digits , int index , HashMap<Integer ,  String> map , List<String> list){
      if(index == digits.length()) {
        list.add(prefix);
        return;
      }
      String letters =map.get(digits.charAt(index) -'0');
      for (int i = 0; i < letters.length(); i++) {
          generatecombination(prefix + letters.charAt(i), digits, index+1, map, list);
      }
        
    }
    public static void main(String[] args) {

        System.out.println(letterCombinations("23"));
    }
}
