package FUNCTIONS;

public class MaxDifferenceYouCanGetFromChanginganInteger {
    public static int MaxDiff(int num){
        int a = 0 , b = 0 ;
        String s = Integer.toString(num);
        char x = s.charAt(0);
        char y = (char) (Math.random()*9 + 1 + '0');
        System.out.println(y);
        return 0 ;

    }
    public static void main(String[] args) {
        System.out.println(MaxDiff(555));
    }
}
