package Java_Concepts.Multithreading.A2ThreadByImplementingRunnable;

public class Hello {
    public static void main(String[] args){ // main Thread
        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
