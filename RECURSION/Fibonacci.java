package RECURSION;

public class Fibonacci {
    // public static void fibo(int a,int b,int n){
    //     if(n==0){
    //         return;
    //     }
    //      int c = a + b;
    //     System.out.print(" "+c);
    //     fibo(b,c,n-1);
    // }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1) +fib(n-2); 
    }
    public static void main(String[] args) {
        
        System.out.print(fib(4));
        
    }
}
