package DSA.Step7StackandQueues;
import java.util.Queue;
import java.util.LinkedList;

class StackQ{
	Queue<Integer> q = new LinkedList<>();
	
	void push(int x) {
		int s = q.size();
		q.add(x);
		for(int i=0;i<s;i++) {
			q.add(q.poll());
		}
		return;
	}
	
	int pop() {
		if(q.isEmpty()) {
		   System.out.print("Stack Underflow-");
		   return 0;
		}
		return q.poll();
	}
	
	int top() {
		if(q.isEmpty()) {
			System.out.print("Stack is Empty-");
			return 0;
		}
		return q.peek();
	}
	
	int size() {
		return q.size();
	}
	
	boolean isEmpty() {
		return q.isEmpty();
	}
	
}
public class ImplementStackUsingQueue {
	public static void main(String args[]) {
		StackQ st = new StackQ();
		st.push(1);
//		st.push(2);
//		st.push(3);
//		st.push(4);
//		st.push(5);
//		
		System.out.println(st.pop());
		System.out.println(st.top());
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.print(st.pop());
	}
}
