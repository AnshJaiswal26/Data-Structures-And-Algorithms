package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class A9RemoveIfAndRemoveAll {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		// we can also remove elements based on conditions
		list.removeIf(element->element%2==0);// removing all even elements
		System.out.println(list+"\n");
		
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
		System.out.println(list2);
		System.out.println(list1);
		
		// we can also remove common elements of list1 and list2 from list2
		list2.removeAll(list1);
		
		System.out.print(list2);
	}
}
