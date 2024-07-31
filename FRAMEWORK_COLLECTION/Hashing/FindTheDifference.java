package FRAMEWORK_COLLECTION.Hashing;


import java.util.HashMap;
import java.util.Map;


public class FindTheDifference {
    public char findTheDifference(String s, String t) {
              Map<Character, Integer> charCount = new HashMap<>();
        
        // Count characters in t
        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Subtract counts for characters in s
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.get(c) - 1);
        }
        
        // Find the character with count 1 (extra character in t)
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("No difference found");
    }
    public static void main(String[] args) {
        
    }
}
