package Regular_Expression;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String s = " hi its me   subhadip  a java     developer ";
        System.out.println("Original: "+s);
        System.err.println("After Removing: "+s.replaceAll("\\s", ""));
    }
}
