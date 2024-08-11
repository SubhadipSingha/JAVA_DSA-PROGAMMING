package METHODS;

class Calculator {
    public int num;

    int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10; // Correctly remove the last digit
        }
        return sum; // Return the calculated sum
    }
}

public class CalculateSumOfDigits {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sumOfDigits(123));
    }
}
