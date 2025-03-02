package DSA.Step7StackandQueues;

class StackArr{
	int top = -1;
	int[] st = new int[10];
	
	void push(int x) {
		
		if(top==st.length-1) {
			System.out.println("Stack Overflow");
			return;
		}
		top = top+1;
		st[top] = x;
	}
	
	int top() {
		if(top==-1) {
			System.out.println("Stack is Empty");
			return 0; 
		}
		return st[top];
	}
	
	int pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return 0;
		}
		top = top-1;	
		return st[top+1];
	}
	
	int size() {
		if(top==-1) {
			System.out.println("Stack is Empty");
			return 0;
		}
		return top+1;
	}
	
	boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	boolean isFull() {
		if(top == st.length-1) {
			return true;
		}
		return false;
	}
}

public class ImplementStackUsingArr {
	public static void main(String args[]) {
		StackArr st = new StackArr();
		
		for(int i=0;i<5;i++) {
			st.push(i+1);
			System.out.println(st.top()+" ");
		}
		
		System.out.println(st.isFull());
		st.pop();
		System.out.println(st.isFull());
		System.out.print(st.size());
	}
}
