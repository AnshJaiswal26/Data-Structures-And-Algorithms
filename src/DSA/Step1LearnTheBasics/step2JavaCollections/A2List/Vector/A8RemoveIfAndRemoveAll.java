package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Vector;

import java.util.Vector;
import java.util.Arrays;

public class A8RemoveIfAndRemoveAll {
	public static void main(String args[]) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		System.out.println(vector);
		
		// we can also remove elements based on conditions
		vector.removeIf(element->element%2==0);// removing all even elements
		System.out.println(vector+"\n");
		
		Vector<Integer> vector2 = new Vector<>(Arrays.asList(1,2,3,4,5,6,7));
		Vector<Integer> vector1 = new Vector<>(Arrays.asList(1,2,3));
		System.out.println(vector2);
		System.out.println(vector1);
		
		// we can also remove common elements of vector1 and vector2 from vector2
		vector2.removeAll(vector1);
		
		System.out.print(vector2);
	}
}
