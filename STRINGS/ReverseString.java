package STRINGS;

import java.util.Scanner;

public class ReverseString {

    
    public static void main(String args[]){
         Scanner t=new Scanner(System.in);
         System.out.println("ENTER THE WORD:");
         String word = t.nextLine();
         String rev = "";
         for(int i=word.length()-1;i>=0;i--){
           rev += word.charAt(i);
          
         }
         System.out.println(rev.toLowerCase());
         
    }
    
}