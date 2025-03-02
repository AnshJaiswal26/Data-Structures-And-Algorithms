package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.LinkedList;

import java.util.LinkedList;

public class A2AddingElementsAndSize {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		System.out.println(list.size());// return size of list
		
		list.addFirst(8);
		list.addLast(10);
		System.out.println(list);
		// Adding an element in LinkedList take O(1) time complexity
		// because linked list contains nodes so there is no shifting of
		// elements like ArrayList
	}
}
