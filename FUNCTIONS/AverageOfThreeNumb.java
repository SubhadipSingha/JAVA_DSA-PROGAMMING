package FUNCTIONS;

import java.util.Scanner;

public class AverageOfThreeNumb {
    public static void Average(int a ,int b ,int c){
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("AVERAGE OF THIS THREE NUMBERS IS:"+avg);
        return;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THREE NUMBERS:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        Average(a, b, c);
    }
}
