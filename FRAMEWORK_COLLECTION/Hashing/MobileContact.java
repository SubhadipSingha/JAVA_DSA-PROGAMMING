package FRAMEWORK_COLLECTION.Hashing;


import java.util.*;
public class MobileContact {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String , Long> contact  = new HashMap<>();
        for( int i = 0 ; i < n ; i++){
            String key = sc.next();
            Long   value = sc.nextLong();
            contact.put(key, value);
        }
        String key ="";
    for (int i = 0; i < n; i++) {
         key += " "+ sc.next();
      }  
      String[] k =key.split("\\s");
    //    System.out.println(Arrays.toString(key.split("\\s")));
      for (int  s = 1 ; s<k.length;s++) {
        if (contact.containsKey(k[s])) {
            System.out.println(k[s] + "=" + contact.get(k[s]));
             } else {
              System.out.println("Not found");
             }
      } 
        
    }
}
