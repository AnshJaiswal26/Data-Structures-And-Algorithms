package Java_Concepts.Multithreading.A6ThreadPoolByExecutorsFrameWork;

import java.util.concurrent.*;

public class A8CountDownlatchExample {
    public static void main(String[] args) throws InterruptedException {
        int noOfServices = 3;
        ExecutorService executor = Executors.newFixedThreadPool(noOfServices);
        CountDownLatch latch = new CountDownLatch(noOfServices);

        for(int i=0;i<noOfServices;i++) {
            executor.submit(new DependentServices(latch));
        }

        // latch.await(); // Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted.
        latch.await(3,TimeUnit.SECONDS); // Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted, or the specified waiting time elapses.
        System.out.println("All Services are ended");
        executor.shutdownNow();
    }
}
class DependentServices implements Callable<String> {

    private final CountDownLatch latch;

    public DependentServices(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception{
        try {
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" Service Started");
        } finally {
            latch.countDown();
        }
        return "ok";
    }
}