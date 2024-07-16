package Inheritance;

import javax.swing.JOptionPane;

public class OveriddingInheritance {
    public class phone{
        public float size;
        float screensize(float size){
            return size;
        }
        phone(float size){
            size=this.size;
        }
        void display(){
            JOptionPane.showMessageDialog(null, "Display works and show all the functions");
        }
        void call(){
            JOptionPane.showMessageDialog(null, "YOU CAN CALL ANYONE");
        }
    }

   public class smart extends phone{
    
    smart(float size) {
        super(size);
        
    }

    // float screensize = (float) 6.5;
     void socialmedia(){
        JOptionPane.showMessageDialog(null, "YOU CAN DO SOCIAL MEDIA");
     }
   }
   public class Keypad extends phone{

    Keypad(float size) {
        super(size);
        //TODO Auto-generated constructor stub
    }
    // float screensize = (float) 2.5;
    
   }


    public static void main(String[] args) {
        Inheritance I=new Inheritance();
        smart S=I.new smart();
        Keypad K= I.new Keypad();
        S.display();

    }
}
