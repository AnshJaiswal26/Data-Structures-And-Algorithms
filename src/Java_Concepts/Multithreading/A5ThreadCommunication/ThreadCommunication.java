package Java_Concepts.Multithreading.A5ThreadCommunication;

class SharedResource{
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int val){
        while(hasData){
            try{
                System.out.println(Thread.currentThread().getName()+" is waiting... for consumer to consume data");
//                wait();
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        }
        data = val;
        hasData = true;
        System.out.println(Thread.currentThread().getName()+" produced data "+val);
        notify(); // here we can use notifyAll() if there are more than one consumer thread
    }

    public synchronized void consume(){
        while(!hasData){
            try{
                System.out.println(Thread.currentThread().getName()+" is waiting... for producer to produce data");
                wait();
            }catch (Exception e){
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println(Thread.currentThread().getName()+" consumed data " + data);
        notify();
    }
}

class consumer extends Thread{
    private SharedResource sh;

    consumer(SharedResource o){
        this.sh = o;
    }

    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            sh.consume();
        }
    }
}

class producer extends Thread{
    private SharedResource sh;

    producer(SharedResource o){
        this.sh = o;
    }

    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            sh.produce(i);
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args){
        SharedResource sh = new SharedResource();
        Thread producerThread = new Thread(new producer(sh),"producerThread");
        Thread consumerThread = new Thread(new consumer(sh),"consumerThread");

        producerThread.start();
        consumerThread.start();
    }
}
