package DSA.Step1LearnTheBasics.step2JavaCollections.A3Comparator;
import java.util.ArrayList;
import java.util.Arrays;

// Lamda expression only works in java 8 or above
public class A5LamdaExpressionIntegers {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4,5,3,6,1));
		list.sort(null); // by default sort in ascending order
		System.out.println(list);
		
		list.sort((a,b)-> b-a);
		System.out.println(list);
		
	}
}
