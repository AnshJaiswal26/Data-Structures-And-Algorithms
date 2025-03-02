package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class ThreadTest {
	public static void main(String args[]) {
		// ArrayList done not support modification(writing) and reading simultaneously
		// so here we will use CopyOnWriteArrayList
		
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("Item1");
		list.add("Item2");
		list.add("Item3");
		
		Thread readerThread = new Thread(()-> {
			try {
				while (true) {
					// Iterate through the list
					for(String item: list) {
						System.out.println("Reading item - "+item);
						Thread.sleep(100);// small delay to simulate work
					}
				}
			}catch (Exception e) {
				System.out.println("Exception in reader Thread : "+e);
			}
		});
		
		Thread writerThread = new Thread(()->{
			try {
				Thread.sleep(500); // Delay to allow reading to start first
				list.add("Item4");
				System.out.println("Added Item4 to list");
				
				Thread.sleep(500); 
				list.remove("Item1");
				System.out.println("Removed Item1 from the list");
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		readerThread.start();
		writerThread.start();
	}
}
