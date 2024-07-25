package STRINGS;

public class Base7 {
    public static void ConvertIntoBase7(int num){
        String ans = "";
        while(num > 0){
           int reminder =  num % 7;
           num /= 7; 
            // ans += Integer.toString(reminder);
            System.out.println(reminder);
        }
        
        // return ans;
        
    }
    public static void main(String[] args) {
        int num = -7;
        ConvertIntoBase7(num);
        // System.out.println(ConvertIntoBase7(num));
    }
}
