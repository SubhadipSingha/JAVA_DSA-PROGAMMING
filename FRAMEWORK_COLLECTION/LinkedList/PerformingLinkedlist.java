package FRAMEWORK_COLLECTION.LinkedList;

import java.util.LinkedList;

public class PerformingLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> List1 = new LinkedList<>();
    
        for (int i = 1; i < 4; i++) {
            List1.add(i); 
            
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(List1.get(i)); 
            
        }
        
       
        

    }
}
