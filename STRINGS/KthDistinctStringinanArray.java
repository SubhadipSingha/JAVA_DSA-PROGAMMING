package STRINGS;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class KthDistinctStringinanArray {
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new LinkedHashMap<>();

        // Count occurrences of each string
        for (String c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Iterate through the map to find the k-th distinct string
        int count = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {  // If the string is distinct
                count++;
                if (count == k) {  // When the k-th distinct string is found
                    return key;
                }
            }
        }

        // If k-th distinct string doesn't exist, return an empty string
        return "";

    }
    public static void main(String[] args) {
        String arr[]= {"ddd","dd","d"};
        int k = 2 ;
        System.out.println(kthDistinct(arr, k));
    }
}
