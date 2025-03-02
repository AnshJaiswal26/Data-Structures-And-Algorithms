package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class A6RemoveIfAndRemoveAll {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		// we can use removeIf() to remove elements based on conditions
 		list.removeIf(element-> element%2==0);// it removes all even elements
 		
 		System.out.println(list+"\n");
 		
 		// we can also remove common elements of list1 and list2 from list2
 		LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(3,4,5,7,1,8));
 		LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(3,4,5));
 		System.out.println(list2);
 		System.out.println(list1);
 		
 		list2.removeAll(list1);
 		System.out.println(list2);
	}
}
