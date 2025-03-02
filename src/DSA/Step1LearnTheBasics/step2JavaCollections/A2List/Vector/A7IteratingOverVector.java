package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Vector;

import java.util.Arrays;
import java.util.Vector;

public class A7IteratingOverVector {
	public static void main(String args[]) {
		Vector<Integer> vector = new Vector<>(Arrays.asList(1,2,3,4,5,6,7));
		
		
		// we can iterate over ArrayList by for each loop
		for(int iterator : vector) {
			System.out.print(iterator+" ");
		}
	}
}
