package DSA.Step1LearnTheBasics.step2JavaCollections.A3Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A1DefaultAscendingSort {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,6,1,8));
		
		// here we can use Collections.sort method to sort an array 
		// or ArraList 
		Collections.sort(list); // default ascending ordering by comparator's compare() method
		
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4,2,3,1,5));
		
		// Or we can use .sort(Default comparator(ascending order))
		list1.sort(null); // default ascending ordering by comparator's compare() method
		
		System.out.print(list1);
	}
}
