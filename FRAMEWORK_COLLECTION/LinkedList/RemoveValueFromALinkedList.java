package FRAMEWORK_COLLECTION.LinkedList;

import java.util.LinkedList;

public class RemoveValueFromALinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l =  new LinkedList<>();
        l.add(7);
        l.add(7);
        l.add(7);
        l.add(7);
        l.add(7);
        l.add(7);
        l.add(7);
        System.out.println(l);
        int val = 7 ;
        for(int i = l.size()-1 ;i>=0 ;i--){
           if(l.get(i).equals(val)){
            l.remove(i); 
           } 
        }
        System.out.println("LinkedList After Removing "+val+" is "+l);
        
     }
}
