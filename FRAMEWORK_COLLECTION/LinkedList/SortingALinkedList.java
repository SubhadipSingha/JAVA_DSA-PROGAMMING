package FRAMEWORK_COLLECTION.LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortingALinkedList {
   public static void main(String[] args) {
     LinkedList<Integer> re = new LinkedList<>();
     re.add(100);
     re.add(4);
     re.add(-20);
      Collections.sort(re);
      System.out.println("Assending order"+re);
      Collections.sort(re, Comparator.reverseOrder());
      System.out.println("Dessending order"+re);
    }
   
}