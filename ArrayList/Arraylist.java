package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {

    public static void main(String[] args) {
        //declearing a arraylist 
        ArrayList<String> food = new  ArrayList<String>();
         Scanner s=new Scanner(System.in);
        ArrayList<Integer> nums=new ArrayList<Integer>();
        
         System.out.println("ENTER THE NUMBER OF FOOD ITEMS YOU HAVE EATEN TODAY:");
         int n = s.nextInt();
         s.nextLine(); 

         System.out.println("ENTER THE FOOD NAMES THAT YOU HAVE ATE TODAY:");
       for(int i=0;i<n;i++){
          food.add(s.nextLine());
        }
        // food.add("chop");
        // food.add("muri");
        // food.add("piyaaj");
     
        for(int i=0;i<food.size();i++){
        //displaying element use get
        System.out.println("FOOD ITEMS YOU ENTERED:");
            System.out.println(food.get(i));
        }
    }
}
