package BIT_MANIPULATION;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n = 5;
        int pos = 1;
        //step 1
        int bitmask = 1 <<pos;
        //step 2
        System.out.println("ENTER THE OPTION");
        System.out.println("1 FOR UPDATE 0 TO 1");
        System.out.println("0 FOR UPDATE 1 TO 0");
        int op = s.nextInt();
        if( op == 1){
            int newnumber = (bitmask | n);
            System.out.println(newnumber);
        }else{
            int notvalue = ~(bitmask);
            int newnumber = notvalue & n;
            System.out.println(newnumber);
        }
        
    }
}
