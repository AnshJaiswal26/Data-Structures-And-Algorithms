package Java_Concepts.Multithreading.A6ThreadPoolByExecutorsFrameWork;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args){
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(
                () -> {
                    try{
                        Thread.sleep(4000);
                        System.out.println("Worker");
                    }catch(Exception e){
                        System.out.println("Exception Occurred - "+e);
                    }
                    return "ok";
                }
        );

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(
                () -> {
                    try{
                        Thread.sleep(4000);
                        System.out.println("Worker");
                    }catch(Exception e){
                        System.out.println("Exception Occurred - "+e);
                    }
                    return "ok";
                }
        );

//        String s = null;
//        try {
//             s = f1.get();
//        } catch (InterruptedException e) {
//            System.out.println("Exception Occurred - "+e);
//        } catch (ExecutionException e) {
//            System.out.println("Exception Occurred - "+e);
//        }

        CompletableFuture<Void> f = CompletableFuture.allOf(f1,f2);
//        f.get();
//        f.join();
        System.out.println("Main");
    }
}
