package Placement_Questions;

public class SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
      if(n%n == 0 && n%2 == 0){
        return n;
      }
      int ans = 0;
      for(int i = 2; i<= n*2 ; i++){
        if(i%2 == 0 && i%n == 0){
         ans = i ;
        }
      }
        return ans;
        
    }
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
    }
}
