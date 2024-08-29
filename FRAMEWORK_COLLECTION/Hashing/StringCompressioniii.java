package FRAMEWORK_COLLECTION.Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringCompressioniii {

    public static  String compressedString(String word) {
       HashMap<Character ,Integer> map = new LinkedHashMap<>();
       StringBuilder ans = new StringBuilder();
       for(char c: word.toCharArray()){
          map.put(c, map.getOrDefault(c, 0)+1);
       }
       System.out.println(map);
       for(char k: map.keySet()){
        int c = map.get(k);
        while( c > 9){
            ans.append("9").append(k);
            c -=9;
        }
        if(c>0){
            ans.append(c).append(k);
        }
       }
       return ans.toString();
        
    }

    public static void main(String[] args) {
        System.out.println(compressedString("ssssssssssuuuuubbbbbaaadddiiippp"));
    }
}
