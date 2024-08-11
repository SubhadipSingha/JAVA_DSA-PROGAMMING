package Regular_Expression;

public class CheckDateFormate {
    public static void main(String[] args) {
        String date = "19/12/2003";
        System.err.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
