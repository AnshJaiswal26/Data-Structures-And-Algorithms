package Java_Concepts.Multithreading.A1Thread.ThreadMethods;

public class DaemonThread extends Thread{
    @Override
    public void run(){
        try{
            while(true) {
                System.out.println("Hello world");
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args){
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
        // Daemon Thread - Running in background and uneccessary threads
        // daemon thread are the background threads
        // and JVM don't wait for them and its stops execution when user threads
        // done there processes
        t1.start();

        DaemonThread t2 = new DaemonThread();
        t2.start();
        // in this case t2 is not a daemon thread so the execution is
        // running for infinite times
        System.out.println("Main Done");
    }
}
