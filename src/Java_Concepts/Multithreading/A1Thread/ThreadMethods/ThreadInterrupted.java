package Java_Concepts.Multithreading.A1Thread.ThreadMethods;

public class ThreadInterrupted extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.print("Thread is Running.......");
        }catch(Exception e){
            System.out.println("Thread Interrupted :"+e);
        }
    }

    public static void main(String[] args){
        ThreadInterrupted t1 = new ThreadInterrupted();
        t1.start();
        t1.interrupt();// it interrupts the thread
    }
}
