package Placement_Questions;

public class ThreeDivisor {
    public static boolean FindTHreeDivisor(int n){
      int TotalDivisor = 0;
        for(int i = 1 ; i <= n ; i++){
          if(n%i == 0){
            TotalDivisor++;
            System.out.println("For : (i)"+i+"\t"+TotalDivisor);
          }
      }
        return TotalDivisor == 3;
    }
    public static void main(String[] args) {
        System.out.println(FindTHreeDivisor(11));
    }
}
