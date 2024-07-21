package STRINGS;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int M = strs.length;
        String ch = strs[0];

        for(int i=1;i<M;i++){
           while(strs[i].indexOf(ch) !=0){
               ch = ch.substring(0,ch.length()-1);
               if(ch.isEmpty()){
                return  "";
               }
           }
        }
        return ch;
   }
   public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"};
    System.out.println(longestCommonPrefix(strs));
   }
}
