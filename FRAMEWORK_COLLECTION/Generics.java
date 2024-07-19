package FRAMEWORK_COLLECTION;

import java.util.ArrayList;
import java.util.ListIterator;

public class Generics {
    public static void main(String[] args) {

         List<Integer> List = new List<>(5);
         List.print();
         List<Double> ListD = new List<>(5.5);
         ListD.print();
         List<String> ListS = new List<>("YOU GOT A FRIEND IN ME");
         ListS.print();
         List<Boolean> ListB = new List<>(5==5);
         ListB.print();
         



            ArrayList<Integer> all =new ArrayList<>(List.of(30,40,50,60));

         for(ListIterator<Integer> LI = new ListIterator(); LI.hasNext();){
            System.out.println(LI.next());
         }
    }
   
}
