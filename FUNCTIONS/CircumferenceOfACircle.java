package FUNCTIONS;

import java.util.Scanner;

public class CircumferenceOfACircle {
    public static void Circle(float r){
       float c =0 ;
       float PI = (float) 3.14;
       c= 2 * PI * r;
       System.out.println("CIRCUMFERENCE OF THIS CIRCLE IS:"+c);
       return;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF THE CIRCLE");
        float r = s.nextFloat();
        Circle(r);

    }
}
