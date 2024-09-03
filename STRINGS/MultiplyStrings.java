package STRINGS;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
       String ans  ;
       long n1 = Long.parseLong(num1) ,  n2 =Long.parseLong(num2) ;
       n1 *= n2;
       ans = Long.toString(n1);
        return ans;
        
    }
    public static void main(String[] args) {
        System.out.println(multiply( "123", "456"));
    }
}
