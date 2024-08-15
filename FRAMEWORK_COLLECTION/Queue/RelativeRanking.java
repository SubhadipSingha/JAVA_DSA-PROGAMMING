package FRAMEWORK_COLLECTION.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RelativeRanking {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
       int[] rank  =  {10,9,8,7,6,5,4,3,2,1};
       Arrays.sort(rank);
       for(int n: rank){
            switch (n) {
                case 1 -> list.add("Gold Medal");
                case 2 -> list.add("Silver Medal");
                case 3 -> list.add("Broze Medal");
                default -> {
                    list.add(Integer.toString(n));
                }
            }
       }
       System.out.println(list);
    }
}
