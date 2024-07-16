package PRACTICE;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        long n = s.nextLong();
        long rev = 0;
        while (n!=0) {
           rev = rev*10 + n%10;
           n=n%10;
        }
        System.out.println("REVERSE OF THE NUMBER IS:"+rev);
    }
}
