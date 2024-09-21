package BIT_MANIPULATION;
import java.util.*;
public class GrayCode {
    public static List<Integer> grayCode(int n) {
       List<Integer> list  = new ArrayList<>();
        n = 1 << n;
        for(int i = 0 ; i < n ; i++){
           int value = (i^(i>>1));
           list.add( value );
        }
      
        return list;
        
    }
    public static void main(String[] args) {
        System.err.println(grayCode(1));
    }

}
