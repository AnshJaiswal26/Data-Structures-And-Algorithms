package DSA.Step1LearnTheBasics.step2JavaCollections.A7Queue.A1QueueLinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueMethods {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        // we can also achieve queue by linked list,
        // but it makes complex operations that is why Queue interface is implemented
        // to make it simple

        // adding elements
        // add() / offer() always add elements to last
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        // removing elements
        // poll() / remove() always remove elements from front
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.poll()); // return null if queue is empty
//        queue.remove();               // throws exception if queue is empty

        System.out.println(queue.peek()); // return null if queue is empty
//        System.out.println(queue.element()); // throws exception if queue is empty

        System.out.println(queue.size()); // returns the size of the queue
        System.out.println(queue.isEmpty()); // returns true if queue is empty else false


        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        queue2.add(1);
        queue2.add(2);
        queue2.offer(3); // it does not throw exception
        queue2.add(4); // throws exception if adding more elements than capacity
        System.out.println(queue2);

    }
}
