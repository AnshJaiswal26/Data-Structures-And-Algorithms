package DSA.Step1LearnTheBasics.step2JavaCollections.A7Queue.A4BlockingQueue;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<DelayTask> queue = new DelayQueue<>();
        // Thread safe unbounded blocking Queue
        // Elements can only be taken from the queue when their delay has expired
        // useful for scheduled tasks to be executed after a certain delay
        // Internally priority queue

        DelayTask t1 = new DelayTask("Task1",5,TimeUnit.SECONDS);
        DelayTask t2 = new DelayTask("Task2",3,TimeUnit.SECONDS);
        DelayTask t3 = new DelayTask("Task3",2,TimeUnit.SECONDS);
        queue.put(t1);
        queue.put(t2);
        queue.put(t3);


        while(t1.getDelay(TimeUnit.SECONDS)>0){
            System.out.print("Task1,Task2,Task3 will be executed after "+(t1.getDelay(TimeUnit.SECONDS)<=0 ? ("Executed, "):(t1.getDelay(TimeUnit.MILLISECONDS)+100)/1000+" SECONDS, ")+(t2.getDelay(TimeUnit.SECONDS)<=0 ? ("Executed, "):(t2.getDelay(TimeUnit.MILLISECONDS)+100)/1000+" SECONDS, ")+(t3.getDelay(TimeUnit.SECONDS)<=0 ? ("Executed"):(t3.getDelay(TimeUnit.MILLISECONDS)+100)/1000+" SECONDS.."));
            for(int i=0;i<10;i++) {
                Thread.sleep(90);
                System.out.print(".");
            }
            System.out.println();
        }
        System.out.println();

//        System.out.println(" after "+t1.getDelay(TimeUnit.MILLISECONDS)+" MILLISECONDS"+" Task1 will be executed");
//        System.out.println(" after "+t2.getDelay(TimeUnit.MILLISECONDS)+" MILLISECONDS"+" Task2 will be executed");
//        System.out.println(" after "+t3.getDelay(TimeUnit.MILLISECONDS)+" MILLISECONDS"+" Task3 will be executed");
//        System.out.println();

        while(!queue.isEmpty()){
            DelayTask task = queue.take(); // Block's until a task's delay has expired
            System.out.println("Executed: "+task.getTaskName()+ " at "+System.currentTimeMillis()+" MILLISECONDS");
        }
    }
}
class DelayTask implements Delayed {
    private final String name;
    private final long startTime;
    private final long delay;

    DelayTask(String name,long delay,TimeUnit unit){
        this.name = name;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
        this.delay = unit.toMillis(delay);
    }

    public long getDelayTime() {
        return delay;
    }

    public String getTaskName() {
        return name;
    }

    @Override
    public long getDelay(@NotNull TimeUnit unit) {
        long remainingTime = startTime - System.currentTimeMillis();
        return unit.convert(remainingTime,TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(@NotNull Delayed o) {
        if(this.startTime < ((DelayTask) o).startTime) return -1;
        else if(this.startTime > ((DelayTask) o).startTime) return 1;
        else return 0;
    }
}