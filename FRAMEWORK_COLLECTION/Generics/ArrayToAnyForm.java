package FRAMEWORK_COLLECTION.Generics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
public class ArrayToAnyForm {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        
       List<Integer> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        
        for (int n : num) {
            s.append(n);
        }
        
        BigInteger numb = new BigInteger(s.toString());
        BigInteger result = numb.add(BigInteger.valueOf(k));
        
        String resultString = result.toString();
        for (int i = 0; i < resultString.length(); i++) {
            list.add(Character.getNumericValue(resultString.charAt(i)));
        }
        
        return list;
    }
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9}; 
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }
}
