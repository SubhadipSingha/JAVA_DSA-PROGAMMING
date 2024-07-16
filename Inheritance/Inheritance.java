package Inheritance;

import javax.swing.JOptionPane;

public class Inheritance {

    public class animal{
         int leg=2;
        void eat(){
            JOptionPane.showMessageDialog(null,"They eat for gaining energy");
        }
        void sleep(){
            JOptionPane.showMessageDialog(null,"They sleep for recovery");
        }
    }

    public class human extends animal {
        int leg = 2;
    }
    public class Tiger extends animal {
        int leg = 4;
    }
    // public static final String OveriddingI = null;
    // public static final String Overidding = null;
    public static void main(String args[]){
     Inheritance I = new Inheritance();
      human Human = I.new human();
      Tiger Tiger = I.new Tiger();
    //   Human.eat();
    //   Human.sleep();
    //   Tiger.eat();
    //   Tiger.sleep();
    JOptionPane.showMessageDialog(null,Human.leg);
    JOptionPane.showMessageDialog(null,Tiger.leg);
    }
}
