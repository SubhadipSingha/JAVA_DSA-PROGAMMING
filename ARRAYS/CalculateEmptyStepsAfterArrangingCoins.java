package ARRAYS;

public class CalculateEmptyStepsAfterArrangingCoins {
    public  static int arrangeCoins(int n) {
        int i = 1;
        while(n > 0){
          i++;
          System.out.println("I :"+i);
          n -=i; 
          System.out.println("N :"+n);
        }
        return i -1;
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }
}
