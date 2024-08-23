package BIT_MANIPULATION;

public class ComplementOfnumb {
    public static void main(String[] args) {
        int n = 5 ;
        int mask = (1 << Integer.toBinaryString(n).length()) -1;
        int comp = ~ n & ( mask );

        // System.out.println(~(n));
        System.out.println("num: "+Integer.toBinaryString(n)+"\tmask: "+Integer.toBinaryString(mask)+"\ncomp: "+Integer.toBinaryString(comp));
    }
}
