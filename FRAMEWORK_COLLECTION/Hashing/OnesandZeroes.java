package FRAMEWORK_COLLECTION.Hashing;

public class OnesandZeroes {

    public static int findMaxForm(String[] strs, int m, int n) {
        int countZ = 0, countO = 0, ans = 0;
    
        for (String s : strs) {
            countZ = 0;
            countO = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '0') countZ++;
                else if (c == '1') countO++;
            }
        
            if (countO <= n && countZ <= m) {
                ans++;
                m -= countZ;
                n -= countO;
                System.out.println(s);
            }
        }
        
        return ans;
        
    }


    public static void main(String[] args) {
        String strs[] = {"10","0001","111001","1","0"}; int m = 5, n = 3;
        System.out.println(findMaxForm(strs, m, n));
    }
}
