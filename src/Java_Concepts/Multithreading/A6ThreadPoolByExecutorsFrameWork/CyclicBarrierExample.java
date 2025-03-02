package Java_Concepts.Multithreading.A6ThreadPoolByExecutorsFrameWork;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args){
        int noOfServices = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(noOfServices, new Runnable() {
            @Override
            public void run() {
                System.out.println("All Subsystems completed");
            }
        });

        Thread webServer = new Thread(new subsystems("Web Server",3000,cyclicBarrier));
        Thread CacheServices = new Thread(new subsystems("Cache",1000,cyclicBarrier));
        Thread DatabaseServices = new Thread(new subsystems("Database",4000,cyclicBarrier));
        Thread messagingServices = new Thread(new subsystems("Messaging Service",2500,cyclicBarrier));

        webServer.start();
        CacheServices.start();
        DatabaseServices.start();
        messagingServices.start();
    }
}
class subsystems implements Runnable{
    private String name;
    private int intializationTime;
    private CyclicBarrier barrier;

    subsystems(String name,int intializationTime,CyclicBarrier barrier){
        this.name = name;
        this.intializationTime = intializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run(){
        try {
            System.out.println(name+" initialization.....");
            Thread.sleep(intializationTime);
            System.out.println(name+" initialization Complete");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
           System.out.println("Exception Occurred : "+e);
        }
    }
}
