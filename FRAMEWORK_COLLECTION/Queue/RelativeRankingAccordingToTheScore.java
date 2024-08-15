package FRAMEWORK_COLLECTION.Queue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRankingAccordingToTheScore {
    public  static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] list = new String[n];
        int[] temp = score.clone();
        Arrays.sort(temp); 
      
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rankMap.put(temp[i], n - i); 
        }

        for (int i = 0; i < n; i++) {
            int rank = rankMap.get(score[i]);
            switch (rank) {
                case 1 -> list[i] = "Gold Medal";
                case 2 -> list[i] = "Silver Medal";
                case 3 -> list[i] = "Bronze Medal";
                default -> list[i] = Integer.toString(rank);
            }
        }
        
        return list;

    }
    public static void main(String[] args) {
        int[] score = {10,8,23,34,5,68};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
