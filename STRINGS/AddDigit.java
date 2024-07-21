package STRINGS;

public class AddDigit {
    public static int addDigits(int num) {
  while(num >=10){
        String str = Integer.toString(num);
        int result = 0 ;
       
        for(int i=0;i<str.length();i++)
        {
         result += Integer.parseInt(str.substring(i, i+1));
        }
           num = result;
        
    }
    return num;
 }
    public static void main(String[] args) {
        int num = 56;
        System.out.println(addDigits(num));
    }
}
