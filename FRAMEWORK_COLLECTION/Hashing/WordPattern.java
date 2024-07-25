package FRAMEWORK_COLLECTION.Hashing;

import java.util.HashMap;

public class WordPattern {
    public static boolean CheckPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (wordToChar.containsKey(word)) {
                    return false;
                }
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String Pattern = "abba" ;
        String s =  "dog cat cat dog";
       System.out.println(CheckPattern(Pattern, s));
        
    }
}
