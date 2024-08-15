package PRACTICE;

import java.util.Scanner;

public class Fibonacci {
  public static long fibo(int n){
    if(n<=1){
        return n;
    }
    long Nthfibonacci = ( fibo(n-1) + fibo(n-2) );
    return Nthfibonacci;

  }
    public static void main(String[] args) {
        int n, index;
        Scanner s = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER:");
        n = s.nextInt();
        for(int i=0;i<n;i++){
          System.out.print(fibo(i)+" ");
        }
        System.out.println("ENTER THE INDEX OF WHICH YOU WANT TO SEE THE VALUE:");
        index = s.nextInt();
        for(int j=0;j<=-n;j++){
            if(index == j){
                System.out.print(fibo(index));
            }
        }
        
}
}
