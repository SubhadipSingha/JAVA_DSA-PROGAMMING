package STRINGS;

public class RansomAndMagazin {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int n = magazine.length();
        int m = ransomNote.length();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(ransomNote.charAt(j) == magazine.charAt(i) ){
              count++;
            }else  if(ransomNote.charAt(j) != magazine.charAt(i)){
                count-=1;
              }
            } 
        }
        return count<=magazine.length();
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baa"));
    }
}
