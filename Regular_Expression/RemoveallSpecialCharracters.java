package Regular_Expression;

public class RemoveallSpecialCharracters {
    public static void main(String[] args) {
        String s = "adfw!@#$%^&fgjrh";
        System.out.println("Original: "+s);
        System.out.println("After Removing: "+s.replaceAll("[^a-zA-Z0-9]+", ""));

    }
}
