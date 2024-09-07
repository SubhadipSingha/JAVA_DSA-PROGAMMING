package STRINGS;

import java.util.Arrays;

public class ReverseWordsinaString {
    public static String reverseWords(String s) {
      // Step 1: Trim leading and trailing spaces
    String trimmed = s.trim();

    // Step 2: Split the string by one or more spaces
    String[] words = trimmed.split("\\s+");
    System.out.println(Arrays.toString(words));
    // Step 3: Reverse the words
    StringBuilder ans = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
        ans.append(words[i]);
        if (i != 0) {
            ans.append(" ");
        }
    }

    // Step 4: Return the final reversed string
    return ans.toString();
    }
    public static void main(String[] args) {
         String s = "a good   example";
         System.out.println(reverseWords(s));
    }
}
