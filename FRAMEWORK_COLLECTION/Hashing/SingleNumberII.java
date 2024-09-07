package FRAMEWORK_COLLECTION.Hashing;

import java.util.HashMap;

public class SingleNumberII{
    public static void main(String[] args) {
        int nums[] ={0,1,0,1,0,1,99};
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for (int k : map.keySet()) {
            if(map.get(k) == 1){
                System.out.println(k);
            }
        }
    }
}