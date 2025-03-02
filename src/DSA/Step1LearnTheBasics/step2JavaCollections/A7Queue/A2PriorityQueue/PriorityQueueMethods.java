package DSA.Step1LearnTheBasics.step2JavaCollections.A7Queue.A2PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueMethods {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // natural ordering (lower element first)
        // An unbounded priority queue based on a priority heap.
        // The elements of the priority queue are ordered according to their natural ordering,
        // or by a Comparator provided at queue construction time, depending on which constructor is used.
        // A priority queue does not permit null elements. A priority queue relying on natural ordering also does not
        // permit insertion of non-comparable objects

        // Methods
        // --> Adding elements in priority queue
        // --> it does not perform sorting on elements after adding
        // --> it uses min heap concept to store elements according to its priority
        // --> it adds and adjust that element in a way that it automatically set to its correct position
        //     with the help of min heap
        pq.add(1); // throws exception
        pq.offer(2); // does not throw exception

        pq.remove(1); // throws exception
        pq.poll(); // does not throw exception

        pq.peek(); // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        pq.contains(0); // returns true if element is present
        pq.isEmpty(); // returns true if empty else false
        pq.size(); // returns size

        // we can also reverse the ordering of priority queue
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((o1,o2) -> o2-o1); // using a custom comparator
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(Comparator.reverseOrder()); // using custom comparator (another way)
        pq2.add(1);
        pq2.add(2);
        pq2.add(3);
        pq2.add(4);
        pq2.add(5);
        System.out.println(pq2);

        pq3.add(1);
        pq3.add(2);
        pq3.add(3);
        pq3.add(4);
        pq3.add(5);
        System.out.println(pq3);
        // And also create custom comparator for objects based on priorities
    }
}
