package DynamicProgramming;

import java.util.HashMap;

public class Tribonacci {
   public static int trib(int n){
     return trib(n, new HashMap<>());
   }
   public static int trib(int n , HashMap<Integer , Integer> map ){
    if( n== 0) return 0;
    if( n == 1 || n == 2) return 1;
    if(map.containsKey(n)){
        return map.get(n);
    }
    int result =  trib(n - 1 , map) + trib(n - 2 , map) + trib(n - 3 , map) ;
    map.put(n, result);
    return result;
   }
    public static void main(String[] args) {
        System.out.println(trib(4));
    }
}
