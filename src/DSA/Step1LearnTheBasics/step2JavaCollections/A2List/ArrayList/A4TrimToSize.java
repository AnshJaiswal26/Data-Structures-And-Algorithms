package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.ArrayList;

import java.util.ArrayList;

public class A4TrimToSize {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		
		// now the default capacity of ArrayList is 10 x 1.5 = 16
		// after removing some elements the default capacity in ArrayList 
		// is remains 16
		list.remove(0);
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(4);
		
		// so here we are using trimToSize() function to save memory
		list.trimToSize();
		
		// now after using trimToSize() function the default size reduces
		// to no.of.elements (which is default capacity - (10) after adding more than 10 
		// elements capacity was (16) and after using trimToSize() function capacity is
		// 12-5 = 7 )
		
		System.out.print(list);
		
		
	}
}
