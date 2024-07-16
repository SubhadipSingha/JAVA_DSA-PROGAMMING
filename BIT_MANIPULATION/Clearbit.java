package BIT_MANIPULATION;

public class Clearbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        //step 1
        int BitMask = 1 << pos;
        //step- 2
        int NotValue = ~(BitMask);
        int NewNumber = (NotValue & n);
        System.out.println(NewNumber);
    }
}
