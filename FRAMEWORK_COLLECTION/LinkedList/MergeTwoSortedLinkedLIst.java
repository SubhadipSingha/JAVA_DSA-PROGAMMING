package FRAMEWORK_COLLECTION.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLinkedLIst {
    public static void main(String[] args) {
        List<Integer> ans = new LinkedList<>();
            List<Integer> list = new LinkedList<>();
            list.add(2);
            list.add(4);
            list.add(3);
            System.out.println(list);
    
            List<Integer> list2 = new LinkedList<>();
            list2.add(5);  // Corrected: Adding elements to list2
            list2.add(1);
            list2.add(8);
            System.out.println(list2); 
            
            for(int l: list2){
               list.add(l);
            }
            Collections.sort(list);
            System.out.println(list);
    }
}
