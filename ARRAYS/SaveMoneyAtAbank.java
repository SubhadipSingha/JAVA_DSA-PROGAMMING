package ARRAYS;

public class SaveMoneyAtAbank {
    public static int totalMoney(int n) {
        int total = 0;
        int fullWeeks = n / 7;
        int remainingDays = n % 7;


        for (int i = 0; i < fullWeeks; i++) {
            total += (7 * (1 + i)) + (7 * 6) / 2;
        }

        for (int i = 0; i < remainingDays; i++) {
            total += (1 + fullWeeks + i);
        }

        return total;
    }
    public static void main(String[] args) {
        System.out.println(totalMoney(10));
    }
}
