package DSA.Step1LearnTheBasics.step2JavaCollections.A3Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// custom comparator for sort elements in descending order
class Custom implements Comparator<Integer>{
	@Override
	public int compare(Integer o1,Integer o2) {
		return o2-o1;
	}
	// Compares its two arguments for order. Returns a negative integer,zero, 
	// or a positive integer as the first argument is less than, equal to, 
	// or greater than the second.
}

public class A3DescendingOrderComparator {
	// Or we can also create comparator like this 
	//This approach is often called "creating a custom comparator using an anonymous inner class".
	public static Comparator<Integer> custom = new Comparator<Integer>(){
		public int compare(Integer o1,Integer o2) {
			return o2-o1;
		}
	};
   
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,2,1));
		
		// 
		list.sort(new Custom());
		
		System.out.print(list);
	}
}
