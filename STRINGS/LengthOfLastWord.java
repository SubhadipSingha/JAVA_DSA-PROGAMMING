package STRINGS;

public class LengthOfLastWord {
    public static int lengthLastWord(String s) {
        String[] arr = s.split(" ");
        for(String i : arr){
            System.out.println(i);
        }
        char[] ans = arr[arr.length-1].toCharArray();
        
        return ans.length;
    }
    public static void main(String[] args) {
        System.out.println(lengthLastWord("  fly me   to   the moon  "));
    }
}
