import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        animal.add("Ranbir kapoor");
        animal.add("Boby deol");
        animal.add("anil kapoor");

        //for this for-each loop 
        // we only need
        // variable type
        // index and 
        // the targeted dataset
        for(String i : animal){
         System.out.print("["+i+"]");
        }
    }
}
