package STRINGS;

import java.util.Scanner;

public class StirngsImplementation {
   
   public static void main(String[] args) {
    //BY INITIALIZING VALUE TO THE STRINGS 
     String str1 ="SUBHADIP";
     String str2 ="SINGHA";
    System.out.println(str1+ " " + str2);
    //BY TAKING  VALUES FROM THE STRINGS 
     Scanner s = new Scanner(System.in);
     System.out.println("ENTER YOUR FIRST NAME:");
     String  c =s.nextLine();
     System.out.println("ENTER YOUR LAST NAME:");
     String  h =s.nextLine();
     System.out.println("HERE IS YOUR FULL NAME: "+(c+" "+h));
    
   }
   
}
