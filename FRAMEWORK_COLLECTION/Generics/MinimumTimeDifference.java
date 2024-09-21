package FRAMEWORK_COLLECTION.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference {
    public static int findMinDifference(List<String> timePoints) {
      int Diff = Integer.MAX_VALUE , total[] = new int[timePoints.size()] , i = 0 ;

    for (String time : timePoints) {
        String[]t = time.split(":");
        int hour = Integer.parseInt(t[0]) , min = Integer.parseInt(t[1]); 
        if(hour == 00 && min == 00) {
            hour = 24;
            min = 0;
        }
        total[i] = (hour * 60) + min;
        i++;
    }
     Arrays.sort(total);
    
     for (int n = 1; n < total.length; n++) {
         int d =total[n] - total[n-1];
         Diff = Math.min(Diff , d) ;
     }
     int dif = 24*60 - total[total.length-1] + total[0];
        return Math.min(Diff,dif) ;
    }
    public static void main(String[] args) {
        // timePoints = ["23:59","00:00"]
        // timePoints = ["00:00","23:59","00:00"]
        List<String> list  = new ArrayList<>(List.of("23:59","00:00"));
        System.out.println(findMinDifference(list));
        List<String> list1  = new ArrayList<>(List.of("00:00","23:59","00:00"));
        System.out.println(findMinDifference(list1));
    }
}
