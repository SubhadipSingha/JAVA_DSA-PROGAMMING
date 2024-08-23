package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class MaximumDistanceInAArray {
    
    public static int maxDistance(List<List<Integer>> arrays) {
        int maxDiff = 0;
        int minElement = arrays.get(0).get(0); 
        int maxElement = arrays.get(0).get(arrays.get(0).size() - 1); 
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);
            int currentMin = currentArray.get(0);
            int currentMax = currentArray.get(currentArray.size() - 1);
            maxDiff = Math.max(maxDiff, Math.abs(currentMax - minElement));
            maxDiff = Math.max(maxDiff, Math.abs(maxElement - currentMin));
            minElement = Math.min(minElement, currentMin);
            maxElement = Math.max(maxElement, currentMax);
        }

        return maxDiff;
    }
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> arr1 =new  ArrayList<>(List.of(1));
        ArrayList<Integer> arr2 =new  ArrayList<>(List.of(1));
        ArrayList<Integer> arr3 =new  ArrayList<>(List.of(1,2,3));
        list.add(arr1);
        list.add(arr2);
        // list.add(arr3);
        System.out.println(list);
        System.out.println(maxDistance(list));
        
    }
}
