package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Vector;

import java.util.Vector;

public class A5TrimToSize {
	public static void main(String args[]) {
		Vector<Integer> vector = new Vector<>();
		System.out.println(vector.capacity());
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);
		vector.add(9);
		vector.add(10);
		vector.add(11);
		vector.add(12);
		
		// now the default capacity of Vector is 10 x 2 = 20
		// after removing some elements the default capacity in vector 
		// is remains 20
		vector.remove(0);
		vector.remove(1);
		vector.remove(2);
		vector.remove(3);
		vector.remove(4);
		System.out.println(vector.capacity());
		
		// so here we are using trimToSize() function to save memory
		vector.trimToSize();
		
		// now after using trimToSize() function the default size reduces
		// to no.of.elements (which is default capacity - (10) after adding more than 10 
		// elements capacity was (20) and after using trimToSize() function capacity is
		// 12-5 = 7 )
		
		System.out.print(vector.capacity());
		
		
	}
}
