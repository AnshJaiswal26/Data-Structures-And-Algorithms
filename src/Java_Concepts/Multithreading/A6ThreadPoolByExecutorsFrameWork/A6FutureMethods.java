package Java_Concepts.Multithreading.A6ThreadPoolByExecutorsFrameWork;

import java.util.concurrent.*;

public class A6FutureMethods {
    public static void main(String[] args){
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() ->{
           try {
               Thread.sleep(2000);
           }catch (InterruptedException e){
               System.out.println("Exeception Occured :"+e);
           }
            System.out.println("Hello tasks is running");
            return 42;
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exeception Occured :"+e);
        }


        future.cancel(false);    // cancel(false) :
                                                  // if task is running it does not interrupt the running task
                                                  // if task is not runs before the main thread runs future.cancel(false) then it cancel the task
                                                  // cancel(ture) :
//      future.cancel(true);                      // is used to cancel the running task
        System.out.println(future.isCancelled()); // future.isCancelled() :
                                                  // returns true if future.cancel(true) requests to canceled task
        executor.shutdown();                      // returns true if main thread runs future.cancel(false) requests before the task runs
                                                  // it also returns true if main thread runs future.cancel(false) requests after the task runs because future is marked as cancel
//        Integer i = null;
//        try {
//            System.out.println(future.isDone());
//            i = future.get(1, TimeUnit.SECONDS);        // get() method will block main thread util the tasks completed
//            System.out.println(i);                      // get(timed waited) method will block main thread for the given time
//                                                        // if task not completed within a given time it throws a TimeOutException
//            System.out.println(future.isDone());        // isDone() method returns true if tasks completed else false
//        } catch (InterruptedException | ExecutionException | TimeoutException | CancellationException e) {
//            System.out.println("Exeception Occured :"+e);
//        }
//
//        executor.shutdown();
    }
}
