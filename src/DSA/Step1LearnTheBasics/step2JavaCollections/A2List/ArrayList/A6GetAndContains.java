package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.ArrayList;

import java.util.ArrayList;

public class A6GetAndContains {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		System.out.println(list.contains(2));
		// it returns true if element exists
		
		System.out.print(list.get(3));
		// to get elements by index
		
 	}
}
