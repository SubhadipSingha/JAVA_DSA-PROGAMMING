import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER1 THE NUMBER :");
        long  a=s.nextLong();
        long rev=0;

        while(a!=0)
        {    
            rev = rev*10 + a%10;
            a =a/10;
            System.out.println(rev+""+a);
        }
        System.out.print("REVERSE OF THE GIVEN NUMBER IS:"+rev);
    }
}