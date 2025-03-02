package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.ArrayList;
import java.util.ArrayList;

public class A3RemovingAndReplacingElements {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		// removing elements by index
		list.remove(1);
		
		System.out.println(list);
		
		// removing elements by value
		list.remove(Integer.valueOf(1));
		
		System.out.println(list);
		
		// here we can replace or set elements by index
		list.set(1, 5);
		
		System.out.println(list);
		
		// removing elements can take time up to O(n) in worst case 
		// because if we remove element from 0th index other elements get 
		// shifted left by 1 place which is over all size (n) of the ArrayList

		// Time Complexity - O(n) 
	}
}
