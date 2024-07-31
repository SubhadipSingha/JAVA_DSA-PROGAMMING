package FRAMEWORK_COLLECTION.Mapping;

import java.util.Map;
import java.util.TreeMap;

public class ImplementingTreeMap {

    public static void main(String[] args) {
        TreeMap<Integer , String> addazone = new TreeMap<>(Map.of(1, "subhadip", 2, "anirban" , 3 ,"rupam",4,"sayan"));
        addazone.put(6, "agniva");
        addazone.put(7, "shubham");
        System.out.println(addazone);
        System.out.println(addazone.ceilingEntry(5).getValue());
        System.out.println(addazone.descendingKeySet());
    }
}
