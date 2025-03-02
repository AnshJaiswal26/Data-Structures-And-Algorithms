package Java_Concepts.Multithreading.A1Thread;

public class World extends Thread{

    @Override
   public void run(){
        for(;;){
            System.out.println("world");
        }
    }



}
