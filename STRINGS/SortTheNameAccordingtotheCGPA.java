package STRINGS;

import java.util.*;


public class SortTheNameAccordingtotheCGPA {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline character after the integer input

        List<List<String>> students = new ArrayList<>();
      

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String firstName = sc.next();
            String cgpa = sc.next();
            String[] r = { firstName , cgpa};
            students.addAll(r);
            // idMap.put(firstName, id);
            // cgpaMap.put(firstName, cgpa);
        }

    }
}
