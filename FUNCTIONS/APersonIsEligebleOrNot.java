package FUNCTIONS;

import java.util.Scanner;

public class APersonIsEligebleOrNot {
    public static void main(String[] args) {
        int age ;
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE TO CHECK WHETHER YOU ARE ELIGEBLE FOR VOTE OR NOT:");
        age=s.nextInt();
        if (age>=18) {
            System.out.println("YOU ARE ELIGEBLE FOR VOTE");
        } else {
            System.out.println("YOU ARE NOT ELIGEBLE FOR VOTE");
        }
    }
}
