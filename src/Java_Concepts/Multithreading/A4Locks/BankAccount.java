package Java_Concepts.Multithreading.A4Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance = 100;
    private final Lock lock = new ReentrantLock();

    // if method is synchronized and thread is sleeping in side the method
    // then it creates an issue
    // that is why we will use "Explicit Locks"
    public void withdraw(double amount){
        System.out.println(Thread.currentThread().getName()+" is attempting withdrawal");
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){ // tyLock(with time) Acquires the lock if it is free within the given waiting time and the current thread has not been interrupted.
                if(amount>balance){                             // tyLock() Acquires the lock if it is free and the current thread has not been interrupted.
                    System.out.println("Insufficient amount!!");
                }
                else{
                    try{
                        System.out.println(Thread.currentThread().getName()+" is proceeding withdrawal of Rs."+amount);
                        Thread.sleep(3000);
                    }catch (Exception e){
                        Thread.currentThread().interrupt();
                    }finally{
                        lock.unlock(); // unlock() Releases the lock.
                    }
                    System.out.println("Transaction Successful");
                    balance-=amount;
                    System.out.println("current balance - "+balance);
                }
            }else{
                System.out.println(Thread.currentThread().getName()+" Cannot initiate Transaction please try again later!");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // it shows or stores current thread state was interrupted
                                                // otherwise we don't get information of this thread that an exception got triggered
        }
        if(Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName()+" is Interrupted!");
        }
    }

    public double getBalance() {
        System.out.print("current balance - ");
        return balance;
    }
}
