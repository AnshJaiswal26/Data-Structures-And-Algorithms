package DSA.Step1LearnTheBasics.step2JavaCollections.A2List.Stack;

import java.util.LinkedList;
import java.util.Stack;

public class A5ImplementationOfStack {
	public static void main(String args[]) {
		// as stack extends vector so it is synchronized
		Stack<Integer> stack = new Stack<>();
		
		// here we can implement stack using LinkedList, Vector and ArrayList
		LinkedList<Integer> st = new LinkedList<>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		
		Integer pop = st.removeLast();
		System.out.println(pop);
		
		Integer peek = st.getLast();
		System.out.println(peek);
		
		// stack extends vector class so we can use vector methods in stack
		stack.add(3);// vector method
		stack.add(4);// vector method
		stack.add(5);// vector method
		stack.add(6);// vector method
		stack.add(7);// vector method
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.getLast());// vector method
		
		stack.set(2,4);// vector method
		System.out.print(stack);
	}
}
