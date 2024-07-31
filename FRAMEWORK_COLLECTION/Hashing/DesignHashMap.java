import java.util.Hashtable;

public class DesignHashMap {

    static class MyHashMap {
        Hashtable<Integer , Integer> hs = new Hashtable<>();
    
        public MyHashMap() {
           
        }
        
        public void put(int key, int value) {
            hs.put(key , value);
        }
        
        public int get(int key) {
            return hs.get(key);
        }
        
        public void remove(int key) {
            hs.remove(key);
        }
    }


    public static void main(String[] args) {
        
    }
}
