package FRAMEWORK_COLLECTION.Hashing;

import java.util.Hashtable;

public class PositionOfABall {
    public static int FindPosition(int n,int k){
     Hashtable<Integer,Integer> table =new Hashtable<>();
     int position  = 0 , direction = 1;
     for(int t=0;t<=k;t++){
          table.put(t, position);
          position +=direction;
          
          if(position == 0 || position == n -1){
            direction*=-1;
          }
     }
        return table.get(k);
    }
    public static void main(String[] args) {
        int n = 5 , k=6;
        System.out.println(FindPosition(n, k));
    }
}
