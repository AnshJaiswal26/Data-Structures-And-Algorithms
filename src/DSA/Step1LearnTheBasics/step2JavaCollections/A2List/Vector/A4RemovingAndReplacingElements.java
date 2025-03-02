package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Vector;

import java.util.Vector;

public class A4RemovingAndReplacingElements {
	public static void main(String args[]) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		
		System.out.println(vector);
		
		// removing elements by index
		vector.remove(1);
		
		System.out.println(vector);
		
		// removing elements by value
		vector.remove(Integer.valueOf(1));
		
		System.out.println(vector);
		
		// here we can replace or set elements by index
		vector.set(1, 5);
		
		System.out.println(vector);

		
		// removing elements can take time up to O(n) in worst case 
		// because if we remove element from 0th index other elements get 
		// shifted left by 1 place which is over all size (n) of the ArrayList

		// Time Complexity - O(n) 
	}
}
