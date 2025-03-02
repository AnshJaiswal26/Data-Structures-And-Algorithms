package DSA.Step1LearnTheBasics.step2JavaCollections.A7Queue.A6ConcurrentLinkedDequeu;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExample {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> cdq = new ConcurrentLinkedDeque<>();
        // it is the same as ConcurrentLinkedQueue
        // the only difference is Deque
        // allows insertion and removal from both ends
        // no blocking
        // compare and swap method
        // thread safe
        // faster

    }
}
