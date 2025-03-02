package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Vector;

import java.util.Vector;

public class A6GetAndContains {
	public static void main(String args[]) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		
		System.out.println(vector);
		
		System.out.println(vector.contains(2));
		// it returns true if element exists
		
		System.out.print(vector.get(3));
		// to get elements by index
		
 	}
}
