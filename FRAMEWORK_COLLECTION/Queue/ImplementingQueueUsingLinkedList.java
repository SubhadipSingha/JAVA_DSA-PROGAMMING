package FRAMEWORK_COLLECTION.Queue;

import java.util.LinkedList;
import java.util.Queue;



public class ImplementingQueueUsingLinkedList {
    
    public static void main(String[] args) {
       Queue<String> q= new LinkedList<>();
       q.offer("chad");
       q.offer("sontti");
       q.offer("rogers");
    //    System.out.println(q.peek());
       q.poll(); // dequeue a queue using poll()
       q.poll();
       System.out.println(q.contains("rogers"));

    }
}
