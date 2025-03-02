package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.LinkedList;

import java.util.LinkedList;

public class A4GetAndSetElements {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		// get element by index
		System.out.println(list.get(2));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		// set element by index
		list.set(2,8);
		System.out.print(list);
		
		// here get and set take O(n) time complexity
		// because in Linked List there is no index 
		// there are nodes so get and set runs loop internally 
	}
}
