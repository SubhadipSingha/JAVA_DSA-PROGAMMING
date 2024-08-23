package STRINGS;

public class RemoveTrailingZeros {
    
    public static String removeTrailingZeros(String num) {
       String ans = "";
        for(int i = num.length()-1 ; i >=0  ; i--){
            if(num.charAt(i) != '0'){
           ans = num.substring(0 , i+1);
           break; 
           }
        }
        
        return ans;
        
    }
    
    
    public static void main(String[] args) {
       String num = "56";
         System.out.println(removeTrailingZeros(num));
    }
}
