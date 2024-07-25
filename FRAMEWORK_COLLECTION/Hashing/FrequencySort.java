package FRAMEWORK_COLLECTION.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class FrequencySort {
    public static int[]  SortFrequencywise(int[]arr){
        HashMap<Integer , Integer> Frequency = new HashMap<>();
        for(int num:arr){
            Frequency.put(num, Frequency.getOrDefault(num, 0)+1);
        }
        List<Integer> sortlist = new ArrayList<>(Frequency.keySet());
        Collections.sort(sortlist,(a,b)->Frequency.get(b) - Frequency.get(a));
        int[] ans = new int[arr.length];
        int idx = arr.length-1;
        for (int num : sortlist) {
            for(int i=0;i<Frequency.get(num);i++){
                ans[idx--] = num;
            }
        }
       
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
         System.out.println(Arrays.toString(SortFrequencywise(arr)));
    }
}
