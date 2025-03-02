package Java_Concepts.Multithreading.A4Locks;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class reentrantLock {
    private final Lock lock = new ReentrantLock(); // ReentrantLocks allows thread to reenter in same lock they used
                                                   // ReentrantLocks also achieves synchronization and prevent from deadlocks

    // same thread can be lock() and unlock() multiple times
    // but the no. of lock() and unlock() must be equal
    public void outerMethod(){
        // lock.lockInterruptibly(); lockInterruptibly() is used to interrupt running thread by another thread
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }finally{
            lock.unlock();
        }
    }

    public void innerMethod(){
       lock.lock();
       try{
           System.out.println("Inner Method");
       }finally{
           lock.unlock();
//         lock.unlock();
       }
    }

    public static void main(String[] args){
       reentrantLock ex = new reentrantLock();
       ex.outerMethod();
    }
}
