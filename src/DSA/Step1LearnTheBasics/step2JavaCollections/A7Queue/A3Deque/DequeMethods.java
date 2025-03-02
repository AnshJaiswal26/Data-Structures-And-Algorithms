package DSA.Step1LearnTheBasics.step2JavaCollections.A7Queue.A3Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMethods {
    public static void main(String[] args){
        // A linear collection that supports element insertion and removal at both ends.
        // The name deque is short for "double ended queue" and is usually pronounced "deck".
        // Most Deque implementations place no fixed limits on the number of elements they may contain,
        // but this interface supports capacity-restricted deques as well as those with no fixed size limit.

        Deque<Integer> deque = new ArrayDeque<>();
        // Here we can implement Deque(doubly ended queue) using ArrayDeque.
        // ArrayDeque working
        // It uses 2 pointers approach.
        // It does not shift elements on add/removing a first element like ArrayList.
        // It is a circular array.
        // It is faster than LinkedList and uses less memory.
        // It resizes capacity when the 2 pointers met.

        deque.addFirst(1); // throws exception
        deque.addLast(2);  // throws exception
        deque.offerFirst(3);
        deque.offerLast(4);
        // 3 1 2 4
        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        deque.removeFirst(); // throws exception
        deque.removeLast();  // throws exception
        deque.pollFirst();
        deque.pollLast();

        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);
        deque.offerLast(5);
        deque.offerLast(6);

        System.out.println(deque);
        System.out.println(deque.contains(4));
        System.out.println(deque.reversed()); // reversed the order
        System.out.println(deque);
        System.out.println(deque.peekFirst()); // returns first element
        System.out.println(deque.peekLast());  // returns last element
        System.out.println(deque.peek()); // returns first element

        // we can also implement deque using LinkedList.
        // we will use LinkedList in some cases like insertion, deletion somewhere in the middle, but it takes more memory.
        // and all the methods are the same as ArrayDeque, but LinkedList implements deque. so we can also use LinkedList methods in it
        Deque<Integer> deque2 = new LinkedList<>();
        deque2.addFirst(1);
        deque2.addLast(2);
        deque2.offerFirst(3);
        deque2.offerLast(4);
        System.out.println(deque2);

        // methods of LinkedList
        int first = deque2.getFirst(); // throws exception
        int last = deque2.getLast(); // throws exception

    }
}
