package DSA.Step1LearnTheBasics.step2JavaCollections.A7Queue.A4BlockingQueue;

import java.util.Comparator;
import java.util.concurrent.*;

class producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int count = 0;


    public producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(2000);
                System.out.println("Producer Produces "+count);
                queue.put(count++); // Inserts the specified element into this queue, waiting if necessary for space to become available.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
class consumer implements Runnable{
    private BlockingQueue<Integer> queue;

    public consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                Integer val = queue.take(); // Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
                System.out.println("consumer consumes "+val);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class BlockingQueueExample {
    public static void main(String[] args) {
        // normal Queue
        // It is not thread safe
        // faster --> does not wait
        // add/offer --> if empty
        // remove/poll --> if empty

        // BlockingQueue
        // It is thread safe
        // slower --> waits
        // put --> Inserts the specified element into this queue, waiting if necessary for space to become available.
        // take --> Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
        // offer(timed waited) --> Inserts the specified element into this queue, waiting up to the specified wait time if necessary for space to become available.
        // And it has methods like add/offer, remove/poll, peek.

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // it has fixed capacity
        // A bounded BlockingQueue backed by circular Array
        // low memory overhead
        // uses single lock for both enqueue and dequeue operations
        // more threads --> problem (frequently blocking) and it may create deadlock
        Thread t1 = new Thread(new producer(queue));
        Thread t2 = new Thread(new consumer(queue));
        t1.start();
        t2.start();

        // normal methods
        BlockingQueue<Integer> queue1 = new ArrayBlockingQueue<>(5);
        try{
            queue1.offer(2,1,TimeUnit.SECONDS);
            queue1.poll(1, TimeUnit.SECONDS);
            queue1.peek();
            queue1.add(3);
            queue1.add(4);
            queue1.add(5);
            queue1.add(6);
            queue1.remove();
            queue1.element();
        }catch(Exception e) {
            Thread.currentThread().interrupt();
        }

         // we can also implement BlockingQueue using LinkedList
        BlockingQueue<Integer> queue2 = new LinkedBlockingQueue<>(); // Creates a LinkedBlockingQueue with a capacity of Integer. MAX_VALUE. (recommended custom capacity)
        // optionally bounded backed by LinkedList
        // uses 2 separate Locks for enqueue and dequeue operations
        // Higher concurrency b/w producer and consumer
        // methods
        queue2.offer(2);
        queue2.poll();
        queue2.peek();
        queue2.add(3);
        queue2.add(4);
        queue2.add(5);
        // and put,take poll(timed waited),

        // implementation using PriorityBlocking Queue
        BlockingQueue<Integer> bpq = new PriorityBlockingQueue<>(11); // created with initial capacity and it is dynamic
        // Unbounded
        // Head is based on their natural ordering or a provided comparator
        // put won't block (because size is dynamic)
        // it does not perform sorting it arrange elements at the time of insertion based on their or given priority

        BlockingQueue<Integer> bpq1 = new PriorityBlockingQueue<>(11,(x,y) -> y-x); // custom comparator
        BlockingQueue<Integer> bpq2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder()); // custom comparator (another way)

        BlockingQueue<Integer> spq = new SynchronousQueue<>(); // Creates a SynchronousQueue with non-fair access policy.
        // each insert operation must wait for the corresponding remove operation by another thread and vice versa.
        // it cannot store elements, capacity of at most one element
    }
}
