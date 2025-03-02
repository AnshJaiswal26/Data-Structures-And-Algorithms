package Java_Concepts.Multithreading.A4Locks;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLocks {
    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock writeLock = lock.writeLock();
    private final Lock readLock = lock.readLock();
    // read write lock prevents from unnecessary locking

    public void increment(){
        writeLock.lock();
        try{
            count++;
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();
        try{
            return count;
        }finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args){
        ReadWriteLocks counter = new ReadWriteLocks();

        Runnable write = new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<=10;i++){
                    counter.increment();
                    System.out.println(Thread.currentThread().getName()+" Incremented");
                }
            }
        };

        Runnable read = new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<10;i++) {
                    System.out.println(Thread.currentThread().getName() + " read - " + counter.getCount());
                }
            }
        };

        Thread WriterThread = new Thread(write,"WriterThread");
        Thread ReaderThread1 = new Thread(read,"ReaderThread1");
        Thread ReaderThread2 = new Thread(read,"ReaderThread2");

        WriterThread.start();
        ReaderThread1.start();
        ReaderThread2.start();

        try {
            WriterThread.join();
            ReaderThread1.join();
            ReaderThread2.join();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final Count - "+counter.getCount());
    }
}
