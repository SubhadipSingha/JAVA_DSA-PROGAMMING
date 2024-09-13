package BIT_MANIPULATION;

public class MinimumBitFlipstoConvertNumber {
    public static void main(String[] args) {
        int start = 4 , goal = 3,c =0;
        int xor = start ^ goal;
        System.out.println("Start: "+Integer.toBinaryString(start)+"\tGoal: "+Integer.toBinaryString(goal)+"\tXor: "+Integer.toBinaryString(xor));
        while(xor > 0){
         c+= xor & 1;
         System.out.println(c);
         xor >>= 1;
         System.out.println(xor);
        }
    }
}
