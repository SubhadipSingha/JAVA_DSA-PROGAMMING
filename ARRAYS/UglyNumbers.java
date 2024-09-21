package ARRAYS;

import java.util.Arrays;

public class UglyNumbers {
    public static  int nthUglyNumber(int n) {
        int[] primefactors = new int[n];
        primefactors[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int next2 = 2, next3 = 3, next5 = 5;
        
        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(next2, Math.min(next3, next5));
            primefactors[i] = nextUgly;
            
            if (nextUgly == next2) {
                i2++;
                next2 = primefactors[i2] * 2;
            }
            if (nextUgly == next3) {
                i3++;
                next3 = primefactors[i3] * 3;
            }
            if (nextUgly == next5) {
                i5++;
                next5 = primefactors[i5] * 5;
            }
        }
        
        System.out.println(Arrays.toString(primefactors));
        return primefactors[n-1];
    }
    public static void main(String[] args) {
        int num[] = {1};
        System.out.println(nthUglyNumber(1));
    }
}
