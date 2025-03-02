package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.LinkedList;

import java.util.LinkedList;

public class A3RemovingElements {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		// removing elements by index
		list.remove(0);
		list.remove(1);
		System.out.println(list);
		
		// removing elements by value
		list.remove(Integer.valueOf(4));
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.print(list);
		// removing an element in LinkedList take O(1) time complexity
		// because linked list contains nodes so there is no shifting of
		// elements like ArrayList
	}
}
