package DSA.Step7StackandQueues;
import java.util.Stack;

class pair{
	int a;
	int b;
	
	pair(int a,int b){
		this.a = a;
		this.b = b;
	}
	
}

class MinStack{
	Stack<pair> st = new Stack<>();
	
	void push(int x) {
		int min; 
		if(st.isEmpty()) {
			min = x;
		}
		else {
			min = Math.min(st.peek().b,x);
		}
		st.push(new pair(x,min));
	} 
	int pop() {
		if(st.isEmpty()) {
			System.out.print("Stack Underflow - ");
			return 0;
		}
		int ele =  st.peek().a;
		st.pop();
		return ele;
	}
	
	int peek() {
		if(st.isEmpty()) {
			System.out.print("Stack is Empty-");
			return 0;
		}
		return st.peek().a;
	}
	
	int size() {
		return st.size();
	}
	
	int getMin() {
		if(st.isEmpty()) {
			System.out.print("Stack is Empty-");
			return 0;
		}
		return st.peek().b;
	}
}
// 2 3 4 1
public class ImplementMinStackBetter {
	public static void main(String args[]) {
		MinStack st = new MinStack();
		
		st.push(2);
		st.push(3);
		st.push(1);
		st.push(4);
		st.push(5);
		
		System.out.println(st.peek());
		System.out.println(st.getMin());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.getMin());
	}
}
