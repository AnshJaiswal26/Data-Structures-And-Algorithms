package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Stack;

import java.util.Stack;

public class A2PeekAndContains {
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<>(); 
		
		// adding elements in stack
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		// top element of stack
		System.out.println(st.peek());
		
		System.out.println(st.contains(5));// return true if present else false
	}
}
