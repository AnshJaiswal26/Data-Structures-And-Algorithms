package Java_Concepts.Multithreading.A4Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fairness {
    private final Lock lock = new ReentrantLock(true);
    // Unfair lock means random order of threads can execute process
    // if pass true in the constructor of the ReentrantLock(true)
    // thread who requests first only that thread can execute process first
    // order of request is random any thread can request first

    public void accessResource(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+" acquires the lock");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally{
            System.out.println(Thread.currentThread().getName()+" released the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args){
        Fairness ex = new Fairness();

        Runnable task = new Runnable(){
            @Override
            public void run(){
                ex.accessResource();
            }
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        Thread t3 = new Thread(task,"Thread 3");

        t1.start();
        t2.start();
        t3.start();

    }
}
