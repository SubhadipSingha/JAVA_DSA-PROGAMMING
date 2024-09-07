package ARRAYS;

import java.util.HashMap;

public class CountPairsThatFormaCompleteDayI {
    
    public static int countCompleteDayPairs(int[] hours) {
       
        int count = 0 ;
        for (int i = 0; i <= hours.length-1; i++) {
            int first = hours[i];
           for (int j = i+1; j < hours.length; j++) {
            int second = hours[j];
           if((first + second) % 24 == 0)
                count++;
            
           } 
        }
       
        return count;
        
    }
    
    public static int countCompleteDayPairsusingHasmap(int[] hours) {
       HashMap<Integer ,Integer> map = new HashMap<>();

        int count = 0 ;
      for (int h : hours) {
          int r = h % 24 ;
          int comp = (24 - r ) % 24;
          System.out.println("reminder: "+r+"\tcomplement: "+comp);
          if(map.containsKey(comp)){
            count += map.get(comp);
          }
          map.put( r , map.getOrDefault(r, 0)+1);
      }
       
        return count;
        
    }


    
    public static void main(String[] args) {
        int hours[] =   {72,48,24,3};
        System.out.println(countCompleteDayPairs(hours));
        System.out.println(countCompleteDayPairsusingHasmap(hours));
    }
}
