package interfaces;

import javax.swing.JOptionPane;

import interfaces.Matter.nature;
import interfaces.Matter.property;

public class water implements property , nature{

    @Override
    public void feels() {
       System.out.println("FEELS LIQUID");
    }

    @Override
    public void type() {
        System.out.println("TYPE IS LIQUID");
    }
public static void main(String[] args) {
    water w=new water();
  w.feels();
}
    
} 
