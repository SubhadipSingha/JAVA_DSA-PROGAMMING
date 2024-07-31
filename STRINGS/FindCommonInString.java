package STRINGS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonInString {
    public static List<String> FindCommon(String[] words){
       
        Map<Character, Integer> map = new HashMap<>(); 

        for(char c: words[0].toCharArray()) {
        
        map.put(c, map.getOrDefault(c, 0)+1);
        
        }
        
        for(int i=1; i<words.length; i++) {
        
        Map<Character, Integer> temp = new HashMap<>();
        
        for(char c: words[i].toCharArray()) {
        
        temp.put(c, temp.getOrDefault(c, 0)+1);
        
        }
        
        for(char c: map.keySet()) {
        
        map.put(c, Math.min(map.get(c), temp.getOrDefault(c, 0)));
        
        }
        
        }
        
        List<String> ans = new ArrayList<>();
        
        for(char c: map.keySet()) { for(int i=0; i<map.get(c); i++) {
        
        ans.add(String.valueOf(c));
        }
       
    }
        return ans;
        
    }
    
    public static void main(String[] args) {
        String[] words = {"subhadip" , "ishita" , "sarbani"};
        System.out.println(FindCommon(words));
    }
}
