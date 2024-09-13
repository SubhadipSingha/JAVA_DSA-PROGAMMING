package ARRAYS;

import java.util.ArrayList;

public class ShortestSubarrytobeRemovedtoMakeArraySorted {

    public static int findLengthOfShortestSubarray(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int n : arr) {
            list.add(n);
        }
        for (int i = 1; i < arr.length; i++) {
            if (!(arr[i - 1] <= arr[i])) {
                list.remove(i-1);
                count++;
            }
        }
    
        System.out.println(list);
        return count;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,10,4,2,3,5};
        System.out.println(findLengthOfShortestSubarray(arr));
    }
}