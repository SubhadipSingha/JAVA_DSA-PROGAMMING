package FRAMEWORK_COLLECTION.Hashing;

import java.util.*;

public class HashSetForListDuplicacy {
   
  
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int n = sc.nextInt() ;
        sc.nextLine();
        HashSet<String> set = new HashSet<>() ;
        for (int i = 0; i < n; i++) {
           String s1 = sc.next();
           String s2 = sc.next();
           sc.nextLine();
           String s = s1+" "+s2;
           set.add(s);
          System.out.println(set.size());
        }
      sc.close();
      
    }
}
