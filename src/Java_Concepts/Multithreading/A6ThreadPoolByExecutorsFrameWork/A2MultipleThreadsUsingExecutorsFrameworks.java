package Java_Concepts.Multithreading.A6ThreadPoolByExecutorsFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class A2MultipleThreadsUsingExecutorsFrameworks {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis(); // counting milli sec from 1 jan 1970
        ExecutorService executor = Executors.newFixedThreadPool(9);
        // Executors.newCachedThreadPool() - Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available.

        for (int i = 1; i < 10; i++) {
            int FinalI = i;
            // There are 3 types of submit methods
            // executor.submit(); (runnable) which does not return anything
            //          submit(); (callable) Submits a Runnable task for execution and returns a Future representing that task. The Future's get method will return the given result upon successful completion.
            //          submit(); (runnable,result) Submits a Runnable task for execution and returns a Future representing that task. The Future's get method will return null upon successful completion.
            // Future<String> future by this
            // we will use future.get() method to take result and this method also blocks the main thread until the execution gets completed

            executor.submit( // Submits a Runnable task for execution and returns a Future representing that task. The Future's get method will return the given result upon successful completion.
                    () -> {
                        long result = factorial(FinalI);
                        System.out.println(Thread.currentThread().getName() + " - " + result);
                    }
                    , "Thread-" + FinalI);

        }
        executor.shutdown(); // Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted
     // executor.shutdownNow(); // it forcefully shut down all the threads and stops all the current executions
        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);// Blocks until all tasks have completed execution after a shutdown request, or the timeout occurs, or the current thread is interrupted, whichever happens first.
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }

        System.out.print("Time taken - "+(System.currentTimeMillis()-startTime));
    }

    public static long factorial(int val){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long fact = 1;
        for(int i=1;i<=val;i++){
            fact = fact*i;
        }
        return fact;
    }
}
