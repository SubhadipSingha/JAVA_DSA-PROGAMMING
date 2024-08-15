package ARRAYS;

public class LemonedChange {
    public static boolean lemonadeChange(int[] bills) {
        int fives = 0 , Tens = 0;
        for(int m: bills){
            switch (m) {
                case 5 -> fives++;
                case 10 -> {
                    if(fives > 0){
                        fives--;
                        Tens++;
                    }else{
                        return false;
                    }
                }
                case 20 -> {
                    if(Tens > 0 && fives > 0){
                        Tens--;
                        fives--;
                    }else if(fives >= 3){
                        fives -= 3;
                    }else{
                        return false;
                    }
                }
                default -> {
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int bills[] = {5,5,10,20} ;
        System.out.println(lemonadeChange(bills));
    }
}
