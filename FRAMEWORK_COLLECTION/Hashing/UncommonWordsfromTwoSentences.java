package FRAMEWORK_COLLECTION.Hashing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UncommonWordsfromTwoSentences {
    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String , Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (String s  : s1.split("\\s")) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for (String s  : s2.split("\\s")) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        int i = 0;
      for (String s : map.keySet()) {
          if(map.get(s) ==1 ){ ans.add(s);}
      }
      String[] result = new String[ans.size()];
        ans.toArray(result);
        return  result;
        
    }
    public static void main(String[] args) {
           String  s1 = "this apple is sweet", s2 = "this apple is sour", s3 = "apple apple", s4 = "banana";
           System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
           System.out.println(Arrays.toString(uncommonFromSentences(s3, s4)));
    }
}
