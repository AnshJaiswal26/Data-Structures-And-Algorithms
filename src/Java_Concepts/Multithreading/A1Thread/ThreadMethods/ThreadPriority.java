package Java_Concepts.Multithreading.A1Thread.ThreadMethods;

public class ThreadPriority extends Thread{

    private ThreadPriority(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            String a ="";
            for(int j=0;j<100000;j++){
                a+="dfs";
            }
            System.out.println(Thread.currentThread().getName()+" Priority - "+Thread.currentThread().getPriority()+" count - "+i);
            try{
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args){
        ThreadPriority l = new ThreadPriority("Low Priority");
        ThreadPriority n = new ThreadPriority("Normal Priority");
        ThreadPriority h = new ThreadPriority("High Priority");
        l.setPriority(Thread.MIN_PRIORITY);
        n.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        n.start();
        h.start();
    }
}
