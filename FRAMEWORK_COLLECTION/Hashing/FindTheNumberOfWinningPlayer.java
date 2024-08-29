package FRAMEWORK_COLLECTION.Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class FindTheNumberOfWinningPlayer {
    public static int winningPlayerCount(int n, int[][] pick) {
      HashMap<Integer , Integer>[] map = new HashMap[n];
        for (int i = 0 ; i<n;i++) {
            map[i] = new HashMap<>();
         }
         
         for (int[] p : pick) {
             int player = p[0];
             int color = p[1];
             map[player].put(color, map[player].getOrDefault(color, 0)+1);
         }
        System.out.println(Arrays.toString(map));
        int winner = 0 ;
       for(int i = 0 ; i < map.length ; i++){
        for(int k: map[i].keySet()){
            if(i<map[i].get(k)){
                winner++;
                break;
            }
        }
       }
        return winner;
        
    }
   
    public static void main(String[] args) {
        int[][] pick = { {0,8},{0,3}};
        int n = 2;
        System.out.println(winningPlayerCount(n, pick));
    }
}
