package ARRAYS;

import java.util.Hashtable;

public class DistributeCandies {
    public static  int distributeCandies(int[] candyType) {
        Hashtable<Integer , Integer> table = new Hashtable<>();
        int type = 0 ;
        int n = candyType.length / 2;
        for(int c : candyType){
            table.put(c, table.getOrDefault(c, 0)+1);
        }
        type = table.size();
        return Math.min(n , type);
        
    }
    public static void main(String[] args) {
        int[] candyType  = {1,1,3,};
       System.out.println(distributeCandies(candyType)); 
    }
}
