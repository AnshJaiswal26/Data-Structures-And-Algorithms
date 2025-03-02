package DSA.Step1LearnTheBasics.step2JavaCollections.A3Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class A3CreatingComparatorByUsingComparatorInterface {
	// This approach is often called "creating a custom comparator using an anonymous inner class".
	public static Comparator<Integer> custom = new Comparator<Integer>(){
		@Override
		public int compare(Integer o1,Integer o2) {
			return o2-o1;
		}
	};
	
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(41,35,46,22,31));
		// sort list by custom ComparatorInterface
		list.sort(custom);
		 
		// Or we can use like this
		// directly creating an object of anonymous inner class
		list.sort(new Comparator<Integer>(){
			@Override
			public int compare(Integer o1,Integer o2) {
				return o2-o1;
			}
		});
		
		System.out.print(list);
	}
}
