package DSA.Step7StackandQueues;
import java.util.Stack;

class QueueSt{
	Stack<Integer> st1 = new Stack<>();
	Stack<Integer> st2 = new Stack<>();
	
	 
	void add(int x) {
		while(st1.size()>0) st2.push(st1.pop());
		st1.push(x);	
		while(st2.size()>0) st1.push(st2.pop());
		
		return;
	}
	
	int poll() {
		if(st1.size()==0) {
			System.out.print("Queue Underflow-");
			return 0;
		}
		return st1.pop();
	}
	
	int peek() {
		if(st1.size()==0) {
			System.out.print("Queue is Empty");
			return 0;
		}
		return st1.peek();
	}
	int size() {
		return st1.size();
	}
	
	boolean isEmpty() {
		return st1.isEmpty();
	}
}
public class ImplementQueueUsingStackApproach1 {
	public static void main(String args[]) {
		QueueSt q = new QueueSt();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		System.out.println(q.size());
	}
}
