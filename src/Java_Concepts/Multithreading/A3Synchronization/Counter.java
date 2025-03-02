package Java_Concepts.Multithreading.A3Synchronization;

public class Counter {
    private int count = 0;

    // we can also make synchronized methods
    // public synchronized void increment(){} like this
    public void increment(){

        // "synchronized" keyword is used to synchronize this method by threads
        // means only one thread can access at a time
        // synchronized key word uses intrinsic locks
        synchronized (this){
            System.out.println(this);
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}
