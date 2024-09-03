package FRAMEWORK_COLLECTION.Queue;

import java.util.*;

public class ImplementingPriorityQueueTOServerTheStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n ;i++)
        {
            String Queue = sc.next();
            String[] s = Queue.split("\\s");
            System.out.println(Arrays.toString(s));
        }

    }
}
