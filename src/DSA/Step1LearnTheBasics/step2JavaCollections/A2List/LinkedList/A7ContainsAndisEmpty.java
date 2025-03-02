package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.LinkedList;

import java.util.LinkedList;

public class A7ContainsAndisEmpty {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		System.out.println(list.contains(4));// it return true if element is present else return false
		System.out.print(list.isEmpty());// it return true if list is empty else return false
	}
}
