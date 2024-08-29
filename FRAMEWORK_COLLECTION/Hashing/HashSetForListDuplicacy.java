package FRAMEWORK_COLLECTION.Hashing;

import java.util.*;

public class HashSetForListDuplicacy {
   
  
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HashSet<String> set = new HashSet<>() ;

        int n = sc.nextInt() ;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
           String s = sc.next();
           set.add(s);
           sb.append(set.size()).append("\n");
        }
     System.out.println(sb.toString());
      
    }
}
