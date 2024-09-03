package STRINGS;

import java.util.Arrays;

public class FindTheDivisibilityArrayofaString {

    public static int[] divisibilityArray(String word, int m) {
        int idx = 0, arr[] = new int[word.length()];
        long prefixSum = 0;
        for (char c : word.toCharArray()) {
            long num = Character.getNumericValue(c);
            System.out.println(c+" -> "+num);
            prefixSum = (prefixSum * 10 + num) % m;
            System.out.print(prefixSum+" ");
            arr[idx] = prefixSum == 0 ? 1 : 0;
            idx++;
        }
        return arr;
    }

    public static void main(String[] args) {
        String word = "1010"; int m = 10 ;
        System.out.println(Arrays.toString(divisibilityArray(word, m)));
    }
}
