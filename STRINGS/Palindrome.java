package STRINGS;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A = s.nextLine();
        A.toString();
        String reverse ="";
     
        for(int i=A.length()-1;i>=0;i--){
            reverse = reverse + A.charAt(i);
        }
       
        if(A.equals(reverse)){
            System.out.println("THIS is a palindrome text");
        }else{
            System.out.println("THIS is NOT a palindrome text" +A);
        }
      
    }
}
