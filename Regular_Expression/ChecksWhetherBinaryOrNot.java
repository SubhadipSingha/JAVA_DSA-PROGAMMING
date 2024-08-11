package Regular_Expression;

public class ChecksWhetherBinaryOrNot {
    public static void main(String[] args) {
        int num = 11011101;
        String s = String.valueOf(num);
        System.out.println(s);
        System.err.println(s.matches("[01]+"));
    }
}
