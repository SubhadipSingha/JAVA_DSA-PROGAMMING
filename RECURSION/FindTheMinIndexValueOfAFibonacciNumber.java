package RECURSION;

import java.util.ArrayList;
import java.util.List;

public class FindTheMinIndexValueOfAFibonacciNumber {
    
    public static int min(int k){
        List<Integer> temp = new ArrayList<>();
       int i = 0 ;
        while(true){
         int f = fib(i);
         if( f > k) break;
         temp.add(f);
         i++;  
        }
     int min = 0;
         for(int l  = 0 ; l < temp.size()-1 ; l++){
            int f1 = temp.get(l);
            for (int r = l+1; r < temp.size(); r++) {
                int f2 = temp.get(r);
                if(f1 + f2 == k)  min = f1;
                
            }
         }
         return min;
     }
    
    public static int fib(int n){
       if( n == 0 || n == 1 ) return n;
        return fib( n - 2) + fib(n -1);
    }
   
    public static void main(String[] args) {
       System.out.println(min(19)); 
    }
}
