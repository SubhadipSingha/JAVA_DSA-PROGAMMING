package RECURSION;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaystoAddParentheses {

    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '*' || c == '-' || c == '+'){
                String left = expression.substring(0, i);
                String right = expression.substring(i+1);
                List<Integer> leftitems = diffWaysToCompute(left);
                List<Integer> rightitems = diffWaysToCompute(right);
                for ( int l: leftitems ) {
                    for ( int r: rightitems ) {
                        switch (c) {
                            case '*' -> ans.add(l * r);
                            case '-' -> ans.add(l - r);
                            default -> ans.add(l + r);
                        }
                    }
                }
            }
        }
       if(ans.isEmpty()) ans.add(Integer.valueOf(expression));
       return ans;  
    }
    public static void main(String[] args) {
       String expression = "2*3-4*5+2-6";
       System.out.println(diffWaysToCompute(expression));
    }
}
