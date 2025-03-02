package DSA.Step7StackandQueues;
import java.util.Stack;

class MinStack2{
	Long min = Long.MAX_VALUE;
	Stack<Long> st = new Stack<>();
	
	void push(int x) {
		Long val = Long.valueOf(x);
		if(st.isEmpty()) {
			st.push(val);
			min = val;
		}
		else {
			if(val<min) {
				st.push(2*val-min);
				min = val;
			}
			else {
				st.push(val);
			}
		}
		return;
	}
	
	int pop() {
		Long val = st.pop();
		if(st.isEmpty()) {
			System.out.print("Stack Underflow-");
			return 0;
		}
		else {
			if(val<min) {
				Long val1 = min;
				min = 2*min - val;
				return (val1).intValue();
			}
			return (val).intValue();
		}
	}
	
	int peek() {
		Long val = st.peek();
		if(st.isEmpty()) {
			System.out.print("Stack is Empty-");
			return 0;
		}
		else {
			if(val<min) {
				return (min).intValue();
			}
			return (val).intValue();
		}
	}
	
	int getMin() {
		if(st.isEmpty()) {
			System.out.print("Stack is Empty-");
			return 0;
		}
		return (min).intValue();
	}
	
	int size() {
		return st.size();
	}
}
      
public class ImplementMinStackOptimal {
	public static void  main(String args[]) {
		MinStack2 st = new MinStack2();
		
		st.push(2);
		st.push(3);
		st.push(1);
		st.push(4);
		st.push(5);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.getMin());
		st.pop();
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.getMin());
	}
}
