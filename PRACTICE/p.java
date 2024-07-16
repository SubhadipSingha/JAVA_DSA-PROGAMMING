package PRACTICE;

import java.util.Random;

// import java.util.Scanner;
import javax.swing.JOptionPane;
public class p {
    public static void main(String args[]){
        // Scanner s=new Scanner(System.in);
       String name =  JOptionPane.showInputDialog("ENTER THE NAME:");
        Random r = new Random();
       int age = r.nextInt(20);
        JOptionPane.showMessageDialog(null,"HI "+name+" YOUR AGE IS :"+age);

    }
}
