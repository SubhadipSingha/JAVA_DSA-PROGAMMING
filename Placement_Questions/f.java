package PRACTICE;

public class f {
    public static void main(String[] args) {
        int n=10, a =0,b=1,result = 0;
        System.out.print(a+" , "+b);
        for(int i=2;i<=n;i++){
          result = a + b;
          a=b;
          b=result;
          System.out.print(" , "+result);
          if(i%2!=0 && i%1==0){
            System.out.print(" <-not prime" );
          }else if(i%2==0 && i%1!=0){
            System.out.print("<-prime");
          }
        }
    }
}
