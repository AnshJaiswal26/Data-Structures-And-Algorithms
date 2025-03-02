package Java_Concepts.Multithreading.A3Synchronization;

public class MyThread extends Thread{
    private Counter counter;


    MyThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            counter.increment();
        }
    }
}
