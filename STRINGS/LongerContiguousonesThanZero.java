package STRINGS;

import java.util.Arrays;

public class LongerContiguousonesThanZero {
   
    public static void main(String[] args) {
        String s = "11100" ;
        int max0 = Integer.MIN_VALUE , max1 = Integer.MIN_VALUE;
        String[] all1s = s.split("0");
        System.out.println(Arrays.toString(all1s));
        String[] all0s = s.split("1");
        System.out.println(Arrays.toString(all0s));
        for(String z: all0s){
            max0 = Math.max( max0 , z.length());
        }
        for(String o:all1s){
            max1 = Math.max(max1, o.length());
        }
        System.out.println(max0 < max1);
    }
}
