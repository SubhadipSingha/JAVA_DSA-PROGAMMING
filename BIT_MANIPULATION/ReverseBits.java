package BIT_MANIPULATION;

public class ReverseBits {
    public static void main(String[] args) {
        int ans = 0 , n = 0b000010100101000001111010011100 ;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (n&1) ;
            n>>=1;
        }
       System.out.println(ans);
    }
}
