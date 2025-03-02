package Java_Concepts.Multithreading.A6ThreadPoolByExecutorsFrameWork;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class A7ScheduledExecutorsService {
    public static void main(String[] args){
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        // schedule()
        // schedule(runnable) returns nothing and task will run after given time
        // schedule(callable) returns something and task will run after given time
//        scheduler.schedule(
//                () -> System.out.println("Task executed after 5 seconds"),
//                5,
//                TimeUnit.SECONDS
//        );

//      scheduleAtFixedRate() - Submits a periodic action that becomes enabled first after the given initial delay, and subsequently with the given period; that is, executions will commence after initialDelay, then initialDelay + period, then initialDelay + 2 * period, and so on.
        scheduler.scheduleAtFixedRate(
                ()-> {
                    System.out.println("Task executed after every 5 seconds");
                },
                5,
                5,
                TimeUnit.SECONDS
        );

//      scheduleWithFixedDelay() - Submits a periodic action that becomes enabled first after the given initial delay, and subsequently with the given delay between the termination of one execution and the commencement of the next.
//      we will use ScheduledFuture<?> for ScheduledExecutorService to get details of task
        ScheduledFuture<?> taskExecuted = scheduler.scheduleWithFixedDelay(
                () -> System.out.println("Task executed"),
                5,
                5,
                TimeUnit.SECONDS
        );

        System.out.println(taskExecuted.isDone());
        scheduler.schedule(
                () -> {
                    System.out.println("Task Initiated.....");
                    scheduler.shutdown();
                },
                20,
                TimeUnit.SECONDS
        );
    }
}
