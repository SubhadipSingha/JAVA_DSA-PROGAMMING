package FUNCTIONS;

import java.util.Scanner;

public class PrimeNumber {
     public static void Prime(int n){
            if(n%1==0 && n%2!=0 && n>=1){
                System.out.println("THIS NUMBERS: "+n+" IS PRIME");
            }else{
                System.out.println("THIS NUMBERS: "+n+" IS NOT PRIME");
            }
               return ;
        }
    
        public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            System.out.println("ENTER THE NUMBER:");
            int n=s.nextInt();
            Prime(n);
            
        }
    }

