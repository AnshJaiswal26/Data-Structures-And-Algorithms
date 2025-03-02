package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class A5CreatingList {
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<>();
		
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.remove(0);// removing element by index
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8);
		
		// converting List to arrays 
		// here we need an object array because List is an Object
		Object[] arr = list1.toArray();
	}
}
