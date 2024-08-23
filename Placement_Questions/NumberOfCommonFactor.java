package Placement_Questions;

public class NumberOfCommonFactor {
    public static int commonFactors(int a, int b) {
        int com = 0;
        int n = Math.min(a, b);
        for (int i = 1; i <= n; i++) {
            if(a%i == 0 && b%i == 0){
                com++;
            }
        }
        return com;
    }
    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
    }
}
