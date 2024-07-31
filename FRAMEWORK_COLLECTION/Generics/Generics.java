package FRAMEWORK_COLLECTION.Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
         ArrayList<Integer> List = new ArrayList<>(5);
         List.print();
         List<Double> ListD = new List<>(5.5);
         ListD.print();
         List<String> ListS = new List<>("YOU GOT A FRIEND IN ME");
         ListS.print();
         List<Boolean> ListB = new List<>(5==5);
         ListB.print();
         ArrayList<Integer> all =new ArrayList<>(Listof(1,2,3,4,5));
         all.listIterator();
         
    }

   private static Object Listof(int i, int j, int k, int l, int m) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'Listof'");
   }
   
}
