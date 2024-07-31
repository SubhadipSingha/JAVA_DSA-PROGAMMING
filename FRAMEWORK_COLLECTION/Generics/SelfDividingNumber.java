package FRAMEWORK_COLLECTION.Generics;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public static  List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            list.add(i);
        }

        for(int num: list){
            if(isSelfDividing(num)){
                ans.add(num);
            }
        }

        return ans;
        
    }
    private static boolean isSelfDividing(int num) {
        int originalNum = num;
        
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || originalNum % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }
}
