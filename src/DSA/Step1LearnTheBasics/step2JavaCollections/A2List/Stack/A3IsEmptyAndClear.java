package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Stack;

import java.util.Stack;

public class A3IsEmptyAndClear {
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
		
		System.out.println(st.isEmpty());// return true if stack is empty else false
		st.clear();// used to remove all the elements of stack
		
		System.out.println(st);
	}
}
