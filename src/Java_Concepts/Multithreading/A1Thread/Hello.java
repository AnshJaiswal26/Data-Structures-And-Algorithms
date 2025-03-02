package Java_Concepts.Multithreading.A1Thread;

public class Hello {
    public static void main(String[] args){

        World world = new World();
        world.start();

        for(;;){
            System.out.println("Hello");
        }
    }
}
