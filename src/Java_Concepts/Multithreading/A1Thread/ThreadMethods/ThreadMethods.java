package Java_Concepts.Multithreading.A1Thread.ThreadMethods;

public class ThreadMethods extends Thread{
    @Override
    public void run(){ // run()
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(1000); // sleep()
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 = new ThreadMethods();
        t1.start(); // start()
        t1.join(); // join()

        System.out.println(t1.getState());
    }
}
