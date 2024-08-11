package FUNCTIONS;

public class PrimeNumber {
    public static Boolean ChecksPrimes(int num) {
      if(num <= 1) return false;
         for(int i = 2  ;i <= Math.sqrt(num) ; i ++){
               if( num % i == 0){
                  return false;
               }
             }
             return true;
         }
         public static int countPrimes(int n){
            int c = 0 ;
            for(int  i = 2; i<n; i++){
                if(ChecksPrimes(i)){
                   System.out.println(i);
                    c++;
                }
            }
            return c;
         }
     
        public static void main(String args[]){
            int n=10;
           System.out.println((countPrimes(n)) );
            
        }
    }

