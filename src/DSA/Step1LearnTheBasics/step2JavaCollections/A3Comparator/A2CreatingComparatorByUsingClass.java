package DSA.Step1LearnTheBasics.step2JavaCollections.A3Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// custom comparator by using class which implements comparator 
// to sort elements in descending order
class CustomComp implements Comparator<Integer>{
	@Override // "Override" Indicates that a method declaration is intended to override a method declaration in a supertype. If a method is annotated with this annotation type compilers are required to generate an error message
	public int compare(Integer o1,Integer o2) {
		return o2-o1;
	}
	// Compares its two arguments for order. Returns a negative integer,zero, 
	// or a positive integer as the first argument is less than, equal to, 
	// or greater than the second.
}
public class A2CreatingComparatorByUsingClass {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,2,4,5,1,6));
		
		Comparator<Integer> comp = new CustomComp();
		list.sort(comp);
		System.out.print(list);
	}
}
