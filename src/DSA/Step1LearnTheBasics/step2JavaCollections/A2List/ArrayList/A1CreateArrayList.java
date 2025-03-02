package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class A1CreateArrayList {
	public static void main(String[] args) {
		// ArrayList with default capacity 10 (Internal array size)
		// it will be Resize after adding more than 10 elements
		// after adding more than 10 elements ArrayList Internal Capacity
		// becomes 1.5x of default capacity (default capacity - 10 x 1.5 = 16)
		
		// (default constructor) creating ArrayList with a default capacity of 10 
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		// here we can convert list into array with the method .toArray()
		// List(list) is an object so we need and object array to get list as array
		Object [] arr = list.toArray();
		// here we can take all elements from a List into array
		
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		
		// Or
		// List is a parent class of ArryList
		List<Integer> lista = new ArrayList<>();
 		
		// creating an ArrayList with a specified capacity 
		ArrayList<Integer> list1 = new ArrayList<>(25);
		
		//creating an ArrayList from another collection
		List<String> newList = Arrays.asList("banana","apple","mango");
		ArrayList<String> list2 = new ArrayList<>(newList);
		System.out.println(list2);
	}
}
