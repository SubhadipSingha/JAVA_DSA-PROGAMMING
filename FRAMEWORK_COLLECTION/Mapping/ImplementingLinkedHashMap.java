package FRAMEWORK_COLLECTION.Mapping;

import java.util.LinkedHashMap;

public class ImplementingLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer , Character> lm = new LinkedHashMap<>(5,.75f,false);
        lm.put(1, 'a');
        lm.put(2, 'b');
        lm.put(3, 'c');
        lm.put(4, 'd');
        lm.put(5, 'e');
        lm.put(6, 'a');
        lm.put(7, 'b');
        lm.put(8, 'c');
        System.out.println(lm);
        lm.forEach((key , value)->System.out.println(key+" "+value));
    }
}
