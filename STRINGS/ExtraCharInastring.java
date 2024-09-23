
import java.util.Arrays;
import java.util.HashSet;

public class ExtraCharInastring {
    public static int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        HashSet<String> dict = new HashSet<>();
      
        dict.addAll(Arrays.asList(dictionary));
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;  
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (dict.contains(sub)) {
                    dp[i] = Math.min(dp[i], dp[j]); 
                }
            }
        }
         System.out.println(Arrays.toString(dp));
        return dp[n];
        }
    public static void main(String[] args) {
        String s = "leetscode", dictionary[] = {"leet","code","leetcode"} ,  s1 = "dwmodizxvvbosxxw", dictionary1[] = {"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"};
       System.out.println(minExtraChar(s, dictionary));
       System.out.println(minExtraChar(s1, dictionary1));
    }
}
