package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class UniqueElements {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        // ArrayList<Integer> Integer= new  ArrayList<>();
        // System.out.println("ENTER 5 INTEGERS:");
        // for(int i =0;i<5;i++){
        //     int t = s.nextInt();
        //    if(!Integer.contains(t)){
        //     Integer.add(t);
        //    }

        // }
        ArrayList<String> food=new ArrayList<>();
        System.out.println("ENTER 5 FOOD NAMES:");
        for(int i=0;i<5;i++){
            String name = s.nextLine();
            if(!food.contains(name)){
                food.add(name);
            }
        }
        System.out.println("HERE IS YOUR UNIQUE STRINGS:");
        for(int i=0;i<food.size();i++){
            System.out.print(" "+food.get(i));
        }

    }
}
