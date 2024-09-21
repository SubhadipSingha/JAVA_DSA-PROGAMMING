package FUNCTIONS;

public class PerfectSquares {

    public static int numSquares(int n) {
      int c = 0;
      if(n==1) return 1;
        while(n != 0){
           if(n%2 == 0){
            n-=2*2;
            System.out.println(n);
            c++;
           }
           else if(n%3==0){
            n-=3*3;
            System.out.println(n);
            c++;
           }
           else {
            n-=2*2;
            System.out.println(n);
            c++;
           }
          
       }
       
        return c;
        
    }
    public static void main(String[] args) {
        int n = 14 ;
        System.out.println(numSquares(n));
    }
}