package RECURSION;

import java.util.Scanner;

public class CheckThePower {
    public static boolean powtwo(int n , int x){
        if(n<=0){
            return false;
        }
       while(n!=1 && x%n==0){
        n=n/2;
       }
        return n == 1;
        
    }
    public static boolean powfour(int n , int x){
        if(n<=0){
            return false;
        }
       while(n!=1 && x%n==0){
        n=n/4;
       }

        return n == 1;
        
    }
    public static boolean powthree(int n , int x){
        if(n<=0){
            return false;
        }
       while(n!=1 && x%n==0){
        n=n/3;
       }
        return n == 1;
        
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE BASE NUMBER:");
        int x =s.nextInt();
        if( powtwo(2,x) && powfour(4, x)){
            System.out.println("YOUR BASE NUMBER IS POWER OF 2 & 4");
        }else if(powtwo(2,x)){
            System.out.println("YOUR BASE NUMBER IS POWER OF 2");
        }else if( powthree(3,x)){
            System.out.println("YOUR BASE NUMBER IS POWER OF 3");
        }
        else{
            System.out.println("YOUR BASE NUMBER IS NOT POWER OF 2,3,4");
        }

    }
}
