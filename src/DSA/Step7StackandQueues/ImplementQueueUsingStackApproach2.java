package DSA.Step7StackandQueues;
import java.util.Stack;

class QueueSt1{
	Stack<Integer> st1 = new Stack<>();
	Stack<Integer> st2 = new Stack<>();
	
	void add(int x) {
		st1.push(x);
	}
	
	int poll() {
		if(!st2.isEmpty()) {
			return st2.pop();
		}
		else {
			while(!st1.isEmpty()) {
				st2.push(st1.pop());
			}
			if(!st2.isEmpty()) return st2.pop();
			System.out.print("Queue Underflow-0");
			return 0;
		}
	}
	
	int peek() {
		if(!st2.isEmpty()) {
			return st2.peek();
		}
		else {
			while(!st1.isEmpty()) {
				st2.push(st1.pop());
			}
			if(!st2.isEmpty()) return st2.peek();
		}
		System.out.print("Queue is Empty-");
		return 0;
	}
	
	int size() {
		return st1.size()+st2.size();
	}
}

public class ImplementQueueUsingStackApproach2 {
	public static void main(String args[]) {
		QueueSt1 q = new QueueSt1();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		q.poll();
		q.add(5);
		q.add(6);
		System.out.println(q.peek());
		System.out.println(q.size());
	}
}
