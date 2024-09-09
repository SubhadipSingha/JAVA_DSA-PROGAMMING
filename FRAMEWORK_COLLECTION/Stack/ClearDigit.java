package FRAMEWORK_COLLECTION.Stack;

import java.util.Stack;

public class ClearDigit {
    
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            stack.push(c);
            if(Character.isDigit(c)){
                stack.pop();
                if(!stack.isEmpty() && !Character.isDigit(stack.peek())){
                    stack.pop();
                }
            }
        }
        StringBuilder answer = new StringBuilder() ;
        for (char c : stack) {
            answer.append(c);
        }
        
        
        return answer.toString();
    }
    
    
    public static void main(String[] args) {
        System.out.println("a3d4fr35");
        System.out.println(clearDigits("adfr"));
    }
    
}
