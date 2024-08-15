package ARRAYS;

public class SuperPow {
  
    public static int superPow(int a, int[] b) {
       int mod = 1337;
       a%=mod;
       int ans = 1;
       for(int digit:b){
        ans = powMod(ans , 10 , mod) * powMod(a,digit , mod)% mod;
       }
       return ans;
    }
    private static int powMod(int base , int exp , int mod){
        int result = 1;
        base %=mod;
        while(exp > 0){
            if(exp % 2 == 1){
                result =  (result * base ) % mod;
            }
            base = (base * base ) % mod;
            exp /=2;
        }
        return result;
    }
    public static void main(String[] args) {
        int a = 2;
        int b[] = {1,0};
        System.out.println(superPow(a, b));
    }
}
