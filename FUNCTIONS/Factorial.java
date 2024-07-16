package FUNCTIONS;

import java.util.Scanner;

public class Factorial {
    public static void Fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f = f*i;
        }
        System.out.println("HERE IS THE PRODUCT OF THIS TWO NUMBERS:"+f);
           return ;
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER FOR FINDING FACTORIAL:");
        int n=s.nextInt();
        Fact(n);
        
    }
}
