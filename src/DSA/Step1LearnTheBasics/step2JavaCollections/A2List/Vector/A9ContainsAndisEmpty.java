package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Vector;

import java.util.Vector;

public class A9ContainsAndisEmpty {
	public static void main(String args[]) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		System.out.println(vector);
		
		System.out.println(vector.contains(4));// it return true if element is present else return false
		System.out.print(vector.isEmpty());// it return true if list is empty else return false
	}
}
