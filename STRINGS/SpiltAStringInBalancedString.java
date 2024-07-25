package STRINGS;

public class SpiltAStringInBalancedString {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int balance = 0, count = 0;
        for (char c : s.toCharArray()) {
            if(c == 'R'){
                balance++;
            }else{
                balance--;
            }
            if(balance == 0){
                count++;
            }
            
        }
        System.out.println(count);
    }
}
