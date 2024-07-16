package FUNCTIONS;

import java.util.Scanner;

public class FibonacciNoWithSwitch {
    public static long Fibonacci(int n){
        if(n<=1){
            return n;
        }
          long FibonacciNth= (Fibonacci(n-1)+Fibonacci(n-2));
        return FibonacciNth;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE: \n1 FOR PRINTING FIBONACCI NUMBERS \n2 FOR PRINTING FIBONACCI FOR A INDEX");
      for(int i =1;i<3;i++){
       int CHOICE = s.nextInt();
        switch (CHOICE){
         case 1: 
         System.out.println("ENTER THE UPPER LIMIT OF THE FIBONACCI NUMBER:");
         int upperlimit = s.nextInt();
         for(int j=0;j<upperlimit;j++){
            System.out.print(Fibonacci(j)+" ");
         }
           break;
        case 2:
        System.out.print("ENTER THE INDEX :");
       int index =s.nextInt() ;
        System.out.print("HERE IS YOUR NTH OR "+index+" FIBONNACCI NUMBER:"+Fibonacci(index));
        break;

        case 3:
        
        return;
        
        default:
        System.out.println("INVALID INPUT!");
        break;
        }
    }

    }
}
