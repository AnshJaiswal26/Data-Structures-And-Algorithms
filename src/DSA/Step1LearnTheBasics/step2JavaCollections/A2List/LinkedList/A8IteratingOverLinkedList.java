package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.LinkedList;

import java.util.LinkedList;
import java.util.Arrays;

public class A8IteratingOverLinkedList {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		
		// we can iterate over ArrayList by for each loop
		for(int iterator : list) {
			System.out.print(iterator+" ");
		}
	}
}
