package DSA.Step1LearnTheBasics.step2JavaCollections.A3Comparator;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;

public class A4SortStringsBasedOnAlphabetsAndLength {
	public static Comparator<String> length = new Comparator<String>() {
		@Override
		public int compare(String o1,String o2) {
			return o1.length()-o2.length();
		}
	};
	public static Comparator<String> length1 = new Comparator<String>() {
		@Override
		public int compare(String o1,String o2) {
			return o2.length()-o1.length();
		}
	};
	
	public static Comparator<String> alphabets = new Comparator<String>() {
		@Override
		public int compare(String o1,String o2) {
			// to compare strings based on alphabets we will use o1.compareTo(o2) method
			return o2.compareTo(o1);
		}
	};
	
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("mango","banana","pineapple"));
		list.sort(null); // by default it sorts based on alphabets in ascending order by comparator's compare() method
		System.out.println("Based on alphabets in ascending order - "+list);
		
		// to sort string based on its length we will use custom comparator
		list.sort(length);
		System.out.println("Based on string length in ascending order - "+list);
		
		// sort in descending order based on alphabets
		list.sort(alphabets);
		System.out.println("Based on alphabets in descending order - "+list);
		
		// to sort string based on its length we will use custom comparator
		list.sort(length1);
		System.out.println("Based on string length in descending order - "+list);
	}
}
