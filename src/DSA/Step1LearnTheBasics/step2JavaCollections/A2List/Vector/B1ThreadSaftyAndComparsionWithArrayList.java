package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Vector;

import java.util.ArrayList;
import java.util.Vector;
//import java.util.Thread;

public class B1ThreadSaftyAndComparsionWithArrayList {
	public static void main(String args[]) {
		// ArrayList is not Synchronized so it can reduce performance or expected output in thread
		ArrayList<Integer> list = new ArrayList<>();
		Thread t1 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				list.add(i);
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				list.add(i);
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(list.size());// expected output 2000
		
		
		// Vector is Synchronized but cannot give high performance
		// because vector is also locked like ArrayList
		Vector<Integer> vector = new Vector<>();
		Thread T1 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				vector.add(i);
			}
		});
				
		Thread T2 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				vector.add(i);
			}
		});
				
		T1.start();
		T2.start();
				
		try {
			T1.join();
			T2.join();
		}catch (InterruptedException E) {
			E.printStackTrace();
		}
		
		System.out.print(vector.size());// expected output 2000
 	}
}
