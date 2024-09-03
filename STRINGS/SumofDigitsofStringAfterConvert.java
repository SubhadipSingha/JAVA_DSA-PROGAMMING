package STRINGS;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SumofDigitsofStringAfterConvert {

    public static int getLucky(String s, int k) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        int id = 1;
        for (char i = 'a'; i <= 'z'; i++) {
            map.put(i, id);
            id++;
        }

        // Convert the string to its numeric equivalent
        String index = "";
        for (char c : s.toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                index += map.get(c);
            }
        }
        
        // Initial sum of digits in index
        int sum = 0;
        for (char c : index.toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        // Apply transformations k-1 times
        k--;
        while (k > 0) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
            k--;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getLucky("IIII", 1)); // Should output 36
    }
}
