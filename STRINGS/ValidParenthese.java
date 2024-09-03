package STRINGS;

import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

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



    public static boolean isValidUsingMapNStack(String s){

     Stack<Character> st = new Stack<>();
     HashMap<Character , Character> map = new HashMap<>();
     map.put(')' , '(');
     map.put('}' , '{');
     map.put(']' , '[');
     for(char c : s.toCharArray()){
        if(map.containsValue(c)){
            st.push(c);
        }else if( map.containsKey(c)){
            if(st.isEmpty() || !Objects.equals(map.get(c), st.pop())){
                return false;
            }
        }
     }
     return st.isEmpty();

    }

        public static void main(String[] args) {
            System.out.println(isValid("()")); // True
            System.out.println(isValid("()[]{}")); // True
            System.out.println(isValid("([)]")); // False
            System.out.println(isValid("{")); // False (odd length)
          }

}

