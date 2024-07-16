package PRACTICE;

import java.util.Random;
import java.util.Scanner;

public class ChanceCalculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        System.out.println("ENTER YOUR NAME:");
        String fname=s.nextLine(); 
        System.out.println("ENTER YOUR CRUSH'S NAME:");
        String lname=s.nextLine();
        // int l1 = fname.length();
        // int l2 = lname.length();
        // int total = (l1+l2)*10;
        int x=r.nextInt(100)+1;
        if(x>=90 && x<=100){
            System.out.println("NOW "+fname+" & "+lname+" YOU GUY'S HAS A CHANCE OF "+x+"% I THINK YOU GUY'S ARE ALREADY IN A RELATIONSHIP");
        }else if(x>=70 && x<=80){
            System.out.println("SO "+fname+" & "+lname+" PUT SOME MORE EFFORTS YOU HAVE A CHANCE OF "+x+"% SUCCESS");
        }else if(x>=30 && x<=60){
            System.out.println( "GUYS"+fname+"& "+lname+"DONT WORRY FIRST MAKE YOUR FRIENDSHIP STRONG "+x+"% SUCCESS");
        }else if(x>=0 && x<=30){
            System.out.println(" SO YOU GUYS "+fname+"& "+lname+" HAVE anir"+x+"% SUCCESS YOU KNOW IT'S OK TO NOT TO BE OK ");
        }else{
            System.out.println("BETTER LUCK NEXT TIME");
        }
        
    }
}
