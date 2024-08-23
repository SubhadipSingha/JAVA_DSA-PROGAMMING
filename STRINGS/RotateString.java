package STRINGS;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
       if(s.length() != goal.length()){
        return false;}
        System.out.println(s+s);
        return (s+s).contains(goal);
        
    }
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
}
