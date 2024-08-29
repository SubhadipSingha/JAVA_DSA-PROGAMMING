package DynamicProgramming;

import java.util.HashMap;

public class FibonacciNumber {
   public static int fib(int n){
    return fib( n , new HashMap<>() );
   }
   public static int fib(int n , HashMap<Integer , Integer> map){
    if( n == 0 ) return 0;
    if( n == 1) return 1;
    if( map.containsKey(n)){
        return map.get(n);
    }
    int result  = fib( n - 2 , map) + fib( n - 1 , map);
   
    return  result;
   }
   
    public static void main(String[] args){
       System.out.println(fib(8));
    }
}
