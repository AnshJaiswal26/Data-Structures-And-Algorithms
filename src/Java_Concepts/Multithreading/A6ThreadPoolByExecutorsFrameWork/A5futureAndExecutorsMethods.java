package Java_Concepts.Multithreading.A6ThreadPoolByExecutorsFrameWork;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class A5futureAndExecutorsMethods {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executor.submit(() -> 1 + 2);
        Integer i = submit.get();
        System.out.println("Sum is "+i);
        Thread.sleep(1);// to give some time to executors thread to complete there tasks then isTerminated() returns true
        System.out.println(executor.isTerminated());

        // invokeAll() method
        // we did not use shutdown() because there is some more tasks to do
        Callable<Integer> collable1 = () -> { // Thread1 runs in 1 sec
            Thread.sleep(1000);
            System.out.println("Task-1 ");
            return 1;
        };
        Callable<Integer> collable2 = () -> { // Thread2 runs in 1 sec
            Thread.sleep(1000);
            System.out.println("Task-2 ");
            return 2;
        };
        Callable<Integer> collable3 = () -> { // Thread1 or Thread2 can't able to run this process
            Thread.sleep(1000);          // because of below invokeAll(list,1,TimeUnit.SECONDS)
            System.out.println("Task-3 ");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(collable1, collable2, collable3);


        List<Future<Integer>> futures = null; //
        try {
            futures = executor.invokeAll(list,1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {

        }

        // there are two invokeAll() methods
        // invokeAll(Collections) - it blocks main Thread until all the executions are done
        // invokeAll(Collections,timed waited) - it blocks main Thread for time limit if in the given time limit
        //                                       threads cannot complete their executions then it ignores them and proceed ahead
        for(Future<Integer> f : futures){
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {

            } catch (ExecutionException e) {

            }catch (CancellationException e) {

            }
        }
        executor.shutdown();

        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        // invokeAny() method
        Callable<Integer> collable4 = () -> { // Thread1 runs in 1 sec
            Thread.sleep(1000);
            System.out.println("Task-1 ");
            return 1;
        };
        Callable<Integer> collable5 = () -> { // Thread2 runs in 1 sec
            Thread.sleep(1000);
            System.out.println("Task-2 ");
            return 2;
        };
        Callable<Integer> collable6 = () -> { // Thread1 or Thread2 can't able to run this process
            Thread.sleep(1000);          // because of below invokeAny(list,1,TimeUnit.SECONDS)
            System.out.println("Task-3 ");
            return 3;
        };

        List<Callable<Integer>> list1 = Arrays.asList(collable4, collable5, collable6);

        try {
            Integer k = executor1.invokeAny(list1); // invokeAny() - this will return the result of thread who complete its execution first
            System.out.println(k);                  // and remaining one's get cancelled
        } catch (InterruptedException e) {          // invokeAny(list,1,TimeUnit.SECONDS) - this will return the result of thread who complete its executions first
                                                    // within a given time and if that thread is not able to complete then all threads will be cancelled
        } catch (ExecutionException e) {

        }catch (CancellationException e) {

        }
        executor1.shutdown();
    }

}




