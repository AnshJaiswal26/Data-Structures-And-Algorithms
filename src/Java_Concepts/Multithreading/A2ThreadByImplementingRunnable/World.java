package Java_Concepts.Multithreading.A2ThreadByImplementingRunnable;

public class World implements Runnable{
    World world;
    @Override
    public void run(){
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }

}
