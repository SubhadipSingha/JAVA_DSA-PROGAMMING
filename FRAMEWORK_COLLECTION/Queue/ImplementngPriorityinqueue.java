package FRAMEWORK_COLLECTION.Queue;

import java.util.PriorityQueue;

public class ImplementngPriorityinqueue {
    public static void main(String[] args) {
        PriorityQueue<Double> queue= new PriorityQueue<>();
        queue.offer(3.3);
        queue.offer(6.3);
        queue.offer(2.3);
        queue.offer(7.3);
        queue.offer(4.3);
        queue.offer(5.3);
        
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        PriorityQueue<Integer> queue1= new PriorityQueue<>();
        queue1.offer(3);
        queue1.offer(6);
        queue1.offer(2);
        queue1.offer(7);
        queue1.offer(4);
        queue1.offer(5);
        
        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }

    }
}
