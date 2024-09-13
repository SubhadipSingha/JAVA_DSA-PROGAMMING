package BIT_MANIPULATION;

public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Integer.toBinaryString(n));
        int pos = 3;
        //step 1
        int bitmask = 1 << pos;
        System.out.println(Integer.toBinaryString(bitmask));
        //step 2
        int not = ~(bitmask);
        int newnumber = (not | n);
        System.out.println(newnumber);
    }
}
