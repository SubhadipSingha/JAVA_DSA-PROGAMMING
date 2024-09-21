package ARRAYS;

import java.util.*;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       
        for (int[] interval : intervals) {
            boolean inrange = false;
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < newInterval.length; j++) {
                if (interval[j] <= newInterval[0] || interval[j] >= newInterval[1]) {
                    row.add(interval[j]);
                    inrange = true;
                } else if(!inrange) break;
            }
            if(!row.isEmpty())list.add(row);
            if(row.size() == 2) count++;
        }
        List<List<Integer>> merged = new ArrayList<>();
       List<Integer> current =  list.get(0);
       
      // System.out.println(list+"\t"+count) ;
     
      for (int i = 1; i < list.size(); i++) {
        List<Integer> next = list.get(i);
        for (int j = 1; j < list.get(i).size(); j++) {
          
          if (current.get(current.size()-1) >= next.get(0)) {
            current.set(current.size()-1, next.get(0));
          } else {
           merged.add(current);
            current = next;
          }
        }
        
      }
      merged.add(current);
      
      int ans[][] = new int[merged.size()][];
      for (int i = 0 ; i < merged.size() ; i++ ) {
        List<Integer> row = merged.get(i);
            ans[i] = row.stream().mapToInt(Integer::intValue).toArray();
          
      }
        return ans;
        
    }
    public static void main(String[] args) {
       int intervals[][] = {{1,2},{3,5},{6,7},{8,10},{12,16}}, newInterval[] = {4,8};
     System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }
}
