package EXTRAS;

import java.util.*;


public class DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) System.out.println("* short");
                if( x>= Integer.MIN_VALUE &&  x<=Integer.MAX_VALUE )System.out.println("* int");
                if( x>= Long.MIN_VALUE &&  x<= Long.MAX_VALUE )System.out.println("* long");
                if( x>=Float.MIN_VALUE &&  x<= Float.MIN_VALUE )System.out.println("* float");
                if( x<= Double.MAX_VALUE && x >= Double.MIN_VALUE) System.out.println("* double");
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

    private static boolean x(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'x'");
    }
}
