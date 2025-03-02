package DSA.Step1LearnTheBasics.step2JavaCollections.A7Queue.A5ConcurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args){
        ConcurrentLinkedQueue<String> cq= new ConcurrentLinkedQueue<>();
        // it does not block/lock reader while writing
        // it also uses compare and swap technique
        // it is a thread safe and faster

        // Thread test
        // here at every millisecond operation will run because ConcurrentLinkedQueue
        // doesn't use locking
        Thread producer = new Thread(()->{
            while(true) {
                cq.add("Task "+System.currentTimeMillis()); // no blocking
            }
        });

        Thread consumer = new Thread(()->{
            while(true) {
                System.out.println("Processing Task - "+cq.poll()); // no blocking
            }
        });

        producer.start();
        consumer.start();

    }
}
