package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class A1CreatingLinkedList {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<>();
		// here LinkedList is Doubly LinkedList and its size is dynamic
		
		// Or
	    // List is a parent class of LinkedList
		List<Integer> lista = new LinkedList<>();
		
		//creating an LinkedList from another collection
		List<String> newList = Arrays.asList("banana","apple","mango");
		LinkedList<String> list2 = new LinkedList<>(newList);
	}
}
