package STRINGS;

public class LongestSubstring {
    public static String CheckOut(String str){
        String  re ="";
        String e = str.substring(0);
        for(int i=0;i<str.length()-1;i++){
            if(str.substring(i,i+1).equals(e)){
                 re+=str.charAt(i);
            }
        }
        return re;

    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(CheckOut(str));
    }
}
