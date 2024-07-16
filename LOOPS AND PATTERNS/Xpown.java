import java.util.Scanner;

public class Xpown {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the base (x): ");
        double x = s.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int n = s.nextInt();

        double result = 1;

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
