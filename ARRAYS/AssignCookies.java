package ARRAYS;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
     Arrays.sort(s); Arrays.sort(g);
        int gn = g.length , sn = s.length , count = 0 , i = 0 , j = 0 ;
      while( i < gn && j < sn) {
            if(s[j] >= g[i]){
                count++;
                i++;
            } 
            j++;
        }
       
       return count;
        
    }
    public static void main(String[] args) {
        int[] g = {10,9,8,7,10,9,8,7};
        int[] s = {10,9,8,7};
        System.out.println(findContentChildren(g, s));
    }
}
