package BIT_MANIPULATION;

public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        //step 1
        int bitmask = 1 <<pos;
        //step 2
        int newnumber = (bitmask | n);
        System.out.println(newnumber);
    }
}
