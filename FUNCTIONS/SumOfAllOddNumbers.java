package FUNCTIONS;

import java.util.Scanner;

public class SumOfAllOddNumbers {
    public static void SumOfAllOdd(int a,int b){
        int sum=0;
        for(int i=a; i<=b; i++){
            if (i%2!=0) {
                sum = sum +i;
            }
        }
        System.out.println("NOW SUM OF ALL ODD NUMBERS IS:"+sum);
        return;
    }

   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER LOWER AND THE UPPER LIMIT OF THE RANGE:");
    int a=s.nextInt();
    int b=s.nextInt();
    SumOfAllOdd(a, b);
   }


}
