package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Vector;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class A1CreatingVector {
	public static void main(String args[]) {
		Vector<Integer> vector1 = new Vector<>();
		// Vector with default capacity 10 (Internal array size)
		// it will be resize after adding more than 10 elements
		// after adding more than 10 elements Vector Internal Capacity
		// becomes 2x of default capacity (default capacity - 10 x 2 = 20)
		
		
		// (default constructor) creating Vector with a default capacity of 10 
		List<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		
		// here we can convert vector into array with the method .toArray()
		// List(vector) is an object so we need and object array to get list as array
		Object [] arr = vector.toArray();
		// here we can take all elements from a vector into array
		
		System.out.println(arr[0]+" "+arr[1]);
		
		// Or
		// List is a parent class of vector
		List<Integer> vector2 = new Vector<>();
 		
		// creating an vector with a specified capacity 
		Vector<Integer> vector3 = new Vector<>(25);
		
		//creating an vector from another collection
		List<String> newvector = Arrays.asList("banana","apple","mango");
		Vector<String> vector4 = new Vector<>(newvector);
		System.out.print(vector4);
	}
}
