package RECURSION;

public class XtothepowerN {
    public static int power(int n,int x){
        if(n==0){
            return 1;
        }
        else if( x==0){
            return 0;
        }
        int pownm1 = power(n-1,x); 
        int xpown = x * pownm1;
        return xpown;
    }
    public static void main(String[] args) {
       int ans = power(4, 2);
       System.err.println(ans);
    }
}
