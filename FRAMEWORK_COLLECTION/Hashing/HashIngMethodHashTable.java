package FRAMEWORK_COLLECTION.Hashing;
import java.util.*;
public class HashIngMethodHashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<>();

        table.put(100, "subha");
        table.put(123, "subhadi");
        table.put(321, "subhadip");
        table.put(555, "subhadip sin");
        table.put(777, "subhadip singha");
        for(int key:table.keySet()){
            System.out.println(key+"\t"+table.get(key));
        }


    }
}
