package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Stack;

import java.util.Stack;

public class A4Search {
	public static void main(String args[]) {
		// Stack extends Vector class
		Stack<Integer> st = new Stack<>(); // creating stack
		
		// adding elements in stack
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		// Indexing of stack will start from 1 
		System.out.print("element index from top - "+st.search(3));
	}
}
