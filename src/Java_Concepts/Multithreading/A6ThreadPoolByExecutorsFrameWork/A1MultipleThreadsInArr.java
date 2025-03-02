package Java_Concepts.Multithreading.A6ThreadPoolByExecutorsFrameWork;

public class A1MultipleThreadsInArr {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis(); // counting milli sec from 1 jan 1970
        Thread[] threads = new Thread[9];

        for (int i = 1; i < 10; i++) {
            int FinalI = i;
            threads[i - 1] = new Thread(
                    () -> {
                        long result = factorial(FinalI);
                        System.out.println(Thread.currentThread().getName()+" - "+result);
                    }
            ,"Thread-"+FinalI);
            threads[i - 1].start();
        }

        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
            }
        }
        System.out.print("Time taken - "+(System.currentTimeMillis()-startTime));
    }

    public static long factorial(int val){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long fact = 1;
        for(int i=1;i<=val;i++){
            fact = fact*i;
        }
        return fact;
    }
}
