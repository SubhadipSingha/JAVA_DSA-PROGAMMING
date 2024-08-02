package FRAMEWORK_COLLECTION.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromAlinkedList {
    public static void main(String[] args) {
         List<Integer> list = new LinkedList<>();
            list.add(2);
            list.add(2);
            list.add(3);
            System.out.println(list);
            Set<Integer> set = new HashSet<>();//as there will be no duplicate element in hashset thats why its a best choice
            set.addAll(list);
            System.out.println(set);
    }
}
