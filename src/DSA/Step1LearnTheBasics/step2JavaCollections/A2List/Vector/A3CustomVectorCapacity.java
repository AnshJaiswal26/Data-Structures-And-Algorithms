package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Vector;

import java.util.Vector;

public class A3CustomVectorCapacity {
	public static void main(String args[]) {
		// here vector is created with Custom capacity of 5 like ArrayList
		Vector<Integer> vector = new Vector<>(5);
		
		// In vectors we can also initialize that if default capacity
		// Or Custom capacity exceeds how much capacity an vector can Increases 
		Vector<Integer> vector1 = new Vector<>(5,3);// here 3 is increment in capacity after 
		// every capacity exceeds and 5 is Custom Capacity
		
		System.out.println("Intial Capacity - "+vector1.capacity());
		vector1.add(1);
		vector1.add(2);
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		vector1.add(6);
		
		System.out.println("after adding elements more than default or Custom Capacity - "+vector1.capacity());
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		vector1.add(6);
		
		System.out.println("again after adding elements more than default or Custom Capacity - "+vector1.capacity());
	}
}
