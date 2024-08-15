package STRINGS;

public class RansomAndMagazin {
    public static boolean canConstruct(String ransomNote, String magazine) {
      String ans = "";
      int index  = 0;
        for(char r: ransomNote.toCharArray()){
            for (int i= 0 ; i<magazine.length() ;i++) {
                if(magazine.charAt(i) == r ){
                 index = i;
                
                }
            }
        }
        System.out.println(magazine.substring(0, index));
        return ransomNote.matches(ans);
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
}
