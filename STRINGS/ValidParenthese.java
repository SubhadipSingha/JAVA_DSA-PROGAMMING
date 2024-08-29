package STRINGS;

public class ValidParenthese {
    
        public static boolean isValid(String s) {
            int n = s.length();
            boolean Valid = false;
            for(int i = 0;i<n-1;i++){
                char c1 = s.charAt(i);
                char c2 = s.charAt(i+1);
                if(c1=='(' && c2==')'){
                    Valid = true; 
                }else if(c1=='{' && c2=='}'){
                    Valid = true; 
                }else if(c1=='[' && c2==']'){
                    Valid = true; 
                }else{
                    Valid = false;
                }
                // Scanner sc =new Scanner(System.in);
                //    String k = sc.
            }
            return Valid & n%2==0;
        }
        public static void main(String[] args) {
            System.out.println(isValid("()")); // True
            System.out.println(isValid("()[]{}")); // True
            System.out.println(isValid("([)]")); // False
            System.out.println(isValid("{")); // False (odd length)
          }

}

