package STRINGS;

import java.util.HashSet;


public class LongestSubstring {
    public static int CheckOut(String str){
        HashSet<Character > set  = new HashSet<>();
        int left = 0  , maxlength = 0  , n = str.length();
        for (int right = 0; right < n; right++) {
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(right));
                left++;
            }
            set.add(str.charAt(right));
            maxlength = Math.max(maxlength , right - left + 1);
        }
        return maxlength;

    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(CheckOut(str));
    }
}
