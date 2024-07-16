package FUNCTIONS;

import java.util.Scanner;

public class GreatestCommonDiviser {
    public static void GCD(int a,int b){
        if(a>b){
         a = a - b;

        }else{
        b= b - a;
        }
        System.out.println("GCD OF THIS NUMBER IS:"+b);
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS:");
        int a =s.nextInt();
        int b=s.nextInt();
        GCD(a, b);

    }
}
