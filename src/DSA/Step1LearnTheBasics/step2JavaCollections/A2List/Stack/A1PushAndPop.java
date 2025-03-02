package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Stack;

import java.util.Stack;

public class A1PushAndPop {
	public static void main(String args[]) {
		// Stack extends Vector class
		// as stack extends vector so it is synchronized
		Stack<Integer> st = new Stack<>(); // creating stack
		
		// adding elements in stack
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		// removing an element from stack
		System.out.println(st.pop());
		
		System.out.println(st);
	}
}
