package BIT_MANIPULATION;

public class AddingBinaryNumbers {
    public static void main(String[] args) {
        String a = "1010" , b = "1101";
        Long x = Long.parseLong( a, 2 );
        Long y = Long.parseLong(b, 2);
        System.out.println("x: "+x+" y: "+ y );
        while(y!=0){
            long carry = x & y ;
            System.out.println("carry: "+carry);
            x = x ^ y ;
            System.out.println("x"+x+"^"+y+": "+x);
            y = carry << 1;
            System.out.println("y = "+carry+" << 1 : "+y);
        }
        System.out.println("answer: "+Long.toBinaryString(x));
    }
}
