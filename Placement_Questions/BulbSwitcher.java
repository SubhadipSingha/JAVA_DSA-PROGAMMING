package Placement_Questions;

public class BulbSwitcher {
    public static int bulbSwitch(int n) {
    int count = 0 ;
        for (int i = 1; i * i <= n ; i++) {
         count++;
     }
        return count;
        
    }
    public static void main(String[] args) {
        int n= 3;
        System.out.println(bulbSwitch(n));
    }
}
