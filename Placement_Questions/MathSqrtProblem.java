package Placement_Questions;

public class MathSqrtProblem {
    public static void main(String[] args) {
        int n = 10 , c = 0; 
        //without inbuilt function 
        for (int i = 1; i*i <= n; i++) {
            c++;
        }
        System.out.println(c);
        //with in built function
        System.out.println((int)Math.sqrt(n));
    }
}
