package Java_Concepts.Multithreading.A6ThreadPoolByExecutorsFrameWork;

public class A3runnableTask implements Runnable{

    @Override
    public void run(){// and we cannot surround it with throws Exception
        try { // we have to use try catch here and this method does not return
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
