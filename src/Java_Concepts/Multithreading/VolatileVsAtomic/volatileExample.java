package Java_Concepts.Multithreading.VolatileVsAtomic;

public class volatileExample {
    public static void main(String[] args){
        SharedObject sh = new SharedObject();
        Thread WriterThread = new Thread(() ->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sh.setFlag();
        });
        Thread ReaderThread = new Thread(() -> sh.printIfFlagTrue());
        WriterThread.start();
        ReaderThread.start();
    }
}
class SharedObject{
    private volatile boolean flag; // volatile keyword allows thread to read task with main memory
                                   // thread cannot read correctly shared field or obj with cache memory(Ram)
                                   // but it is not thread safe
    public void setFlag(){
        flag = true;
        System.out.println(Thread.currentThread().getName()+" set flag as true");
    }
    public void printIfFlagTrue(){
        while(!flag){
            // do nothing
        }
        System.out.println(Thread.currentThread().getName()+" get flag as"+flag);
    }
}
