package Regular_Expression;

public class ChecksHexaDecimalNumber {
    public static void main(String[] args) {
        String s = "A1F89B";
        System.out.println(s.matches("[0-9A-F]+"));
    }
}
