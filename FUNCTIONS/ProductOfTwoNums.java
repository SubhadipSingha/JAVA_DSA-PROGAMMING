package FUNCTIONS;

import java.util.Scanner;

public class ProductOfTwoNums {
    
    
    public static int ProductOfTwoNumbers(int a,int b){
        return a*b;
        
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
     int product = ProductOfTwoNumbers(a, b);

     System.out.println("HERE IS THE PRODUCT OF THIS TWO NUMBERS:"+product);
    }
}
