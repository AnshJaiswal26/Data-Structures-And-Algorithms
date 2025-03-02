package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Vector;

import java.util.Vector;

public class A2AddingElementsAndSize {
	public static void main(String args[]) {
		// here vector is created with default capacity of 10 like ArrayList
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		
		System.out.println("intial capacity - "+vector.capacity());
		System.out.println(vector);
		System.out.println("size - "+vector.size());
		
		// here if we add elements more than default capacity 
		// default size get increases to 2x of initial capacity
		// default capacity - 10 after adding elements more than
		// default capacity current capacity becomes 10x2 - 20
		vector.add(6);
		vector.add(7);
		vector.add(8);
		vector.add(9);
		vector.add(10);
		vector.add(11);
		
		// In vector we can also print capacity
		System.out.println("after adding more than 10 elements capacity - "+vector.capacity());
		
	}
}
