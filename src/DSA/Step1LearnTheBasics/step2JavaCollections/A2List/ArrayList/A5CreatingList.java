package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A5CreatingList {
	public static void main(String args[]) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		// here we can not add elements in List(list1) because
		// List is of fixed size and it is the parent class which does not allow 
		// add function
		// we can set or replace elements in List(list1)
		
		// replace element by index
		list1.set(2, 7);
		
		System.out.println(list1);
		
		String [] arr = {"mango","banana","apple"};
		List<String> list2 = Arrays.asList(arr);
		// here we can also create List from another collection
		
		List<Integer> list3 = List.of(1,4,6,7);
		// List.of() is also a method to create List of fixed size
		// in this method we cannot even replace elements
 		
		
		List<Integer> list  = new ArrayList<>();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.removeFirst();
	}
}
