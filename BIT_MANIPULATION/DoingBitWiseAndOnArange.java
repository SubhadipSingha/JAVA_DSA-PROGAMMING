package BIT_MANIPULATION;

public class DoingBitWiseAndOnArange {
    
    
    
    public static void main(String[] args) {
        int left = 5  , right = 7;
        while(right > left){
            right = right & (right -1);
            System.out.println(right);
        }
         System.out.println("Answer: "+ (left & right));
    }
}
