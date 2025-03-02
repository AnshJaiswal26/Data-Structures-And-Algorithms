package DSA.Step7StackandQueues;

class Node{
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
}

class StackLL{
	int currsize = 0;
	Node top = null;
	
	void push(int x){
		Node Data = new Node(x,top);
		top = Data;
		currsize += 1;
		return;
	}
	
	int pop() {
		if(top == null) {
			System.out.print("Stack Underflow");
			return 0;
		}
		int ele = top.data;
		Node free = top;
		top = top.next;
		free.next = null;
		currsize -= 1;
		return ele;
	}
	
	int top() {
		if(top==null) {
			System.out.println("Stack Underflow");
			return 0;
		}
		return top.data;
	}
	
	int size() {
		if(currsize==0) {
			System.out.println("Stack is Empty");
			return 0;
		}
		return currsize;
	}
	
	boolean isEmpty() {
		if(top==null) {
			return true;
		}
		return false;
	}
}

public class ImplementStackUsingLL {
	public static void main(String args[]) {
		StackLL st = new StackLL();
		
		st.push(3);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(2);
		st.push(8);
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st.pop());
		System.out.println(st.size());
		System.out.println(st.top());
		System.out.println(st.isEmpty());
	}

}
