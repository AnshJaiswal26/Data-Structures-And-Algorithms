package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.ArrayList;
import java.util.ArrayList;

public class A2AddingElementsAndSize {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		// we can directly print ArrayList because it uses toString method
		
		// to get the size of the ArraList we use Size()
		System.out.println(list.size());
 	}
}
// adding elements can take time up to O(n) in worst case 
// because if we add element on 0th index other elements get 
// shifted right by 1 place which is over all size (n) of the ArrayList

// Time Complexity - O(n) 