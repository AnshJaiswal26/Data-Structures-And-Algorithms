package Java_Concepts.Multithreading.A6ThreadPoolByExecutorsFrameWork;

import java.util.concurrent.Callable;

public class A4callableTask implements Callable {
    @Override
    public Object call() throws Exception{ // here we can use throws exception
        Thread.sleep(100);
        return 1; // it returns something
    }
}
