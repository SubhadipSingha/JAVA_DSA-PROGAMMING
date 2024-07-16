package RECURSION;

public class SumOfNaturalNumb {
    public static void print(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
       
         sum += n ;  
        print(n-1,sum);
     
        }
        public static void main(String[] args) {
      
            print(5,0);
        }
}
