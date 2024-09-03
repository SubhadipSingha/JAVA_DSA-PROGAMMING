package STRINGS;

public class RansomAndMagazin {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char arr1[]=magazine.toCharArray();
        char arr2[]=ransomNote.toCharArray();
        int letters[]=new int[26];
        for(char c:arr1)
        {
              letters[c-'a']++;
        }
        for(char d:arr2)
        {
            letters[d-'a']--;
            if(letters[d-'a']==-1)
            return false;
        }
return true;
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
}
