package STRINGS;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
      StringBuilder ans = new StringBuilder() ;
      String temp = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
      char[] ch = temp.toCharArray();
        for(int i = ch.length-1; i>=0;i--){
            ans.append(ch[i]);
        
        }
      
        System.out.println(temp);
      String regex = new String(ans);
      System.out.println(regex);
        return temp.matches(regex);
    }
   
    public static void main(String[] args) {
       String s = "A man, a plan, a canal: Panama";
       System.out.println(isPalindrome(s));
    }
}
