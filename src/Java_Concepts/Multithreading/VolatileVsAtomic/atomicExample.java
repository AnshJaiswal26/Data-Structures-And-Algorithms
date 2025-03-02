package Java_Concepts.Multithreading.VolatileVsAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class atomicExample {
    public static void main(String[] args){
        AtomicCounter At = new AtomicCounter();
        Thread t1 = new Thread(
                () ->{
                    for(int i=0;i<1000;i++){
                        At.setCounter();
                    }
                }
        );

        Thread t2 = new Thread(
                () -> {
                    for(int i=0;i<1000;i++){
                        At.setCounter();
                    }
                }
        );

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(At.getCounter());
    }
}
class AtomicCounter{
    private AtomicInteger counter = new AtomicInteger();
    // it is synchronized and thread safe

    public int getCounter() {
        return counter.get();
    }

    public void setCounter() {
        counter.incrementAndGet();
    }
}
