package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class A7IteratingOverArrayList {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		
		// we can iterate over ArrayList by for each loop
		for(int iterator : list) {
			System.out.print(iterator+" ");
		}
	}
}
