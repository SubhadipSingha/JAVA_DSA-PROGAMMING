package STRINGS;

public class CheckCountTrueORFalse {
    public static boolean checkit(String s){
        int n  = Integer.MIN_VALUE, count =0;
        for(int i=0;i<s.length();i++){

          n = Math.max(n,Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        for(int j=0;j<s.length();j++){
            if(s.charAt(j) == s.charAt(j+1)){
                count ++;
            }
        
        return n == count;
    } 
    public static void main(String[] args) {
        String s = "1210";
         System.out.println(checkit(s));
    }
    
}
