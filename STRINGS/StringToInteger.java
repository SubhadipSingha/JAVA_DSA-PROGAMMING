package STRINGS;

public class StringToInteger {
    public static int myAtoi(String s) {
      String a = s.trim();
      int n = a.length();
      if (n == 0) return 0; 
      int i = 0;
      int sign = 1; 
      long result = 0; 
      if (a.charAt(i) == '-') {
          sign = -1;
          i++;
      } else if (a.charAt(i) == '+') {
          i++;
      }
      while (i < n && Character.isDigit(a.charAt(i))) {
          result = result * 10 + (a.charAt(i) - '0');
          if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
          if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
  
          i++;
      }
      return (int)(sign * result);
    }
   
   
    public static void main(String[] args) {
        String s = "-90";
        System.out.println(myAtoi(s));
    }
}
