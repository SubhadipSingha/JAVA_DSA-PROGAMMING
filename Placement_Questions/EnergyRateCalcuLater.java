package Placement_Questions;

public class EnergyRateCalcuLater {
    public static int CalculateRate(int InitialEnergy , int rate , int time){
      int ans = 0 ;
      ans = InitialEnergy;
      for(int i = 2 ; i < time ; i++ ){
        ans+=rate;
      }
      
        return ans;
        
    }
    public static void main(String[] args) {
        System.out.println(CalculateRate(3, 4, 5));

    }
}
