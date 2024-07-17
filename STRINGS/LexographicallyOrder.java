package STRINGS;

public class LexographicallyOrder {
    public static String CheckOrder(String s)
    {
        char[] carr = s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
           int a = carr[i] - '0';
           int b = carr[i+1] - '0'; 
         if(a%2==b%2&&a>b){
        char temp = carr[i];
         carr[i] = carr[i+1];
          carr[i+1] = temp;
         break;
        }
     }
     return new String(carr);
  }
 public static void main(String[] args) {
    System.out.println(CheckOrder("45320"));
 }
}
