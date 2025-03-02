package DSA.Step7StackandQueues;

class QueueLL{
	Node start = null;
	Node end = null;
	int size = 0;
	
	void enqueue(int x) {
		Node Data = new Node(x,null);
		if(size==0) start = Data;
		else end.next = Data;
	    end = Data;	
		size+=1;
		return;
	}
	
	int dequeue() {
		if(size == 0) {
			System.out.print("Queue Underflow");
			return 0;
		}
		int ele = start.data;
		Node temp = start;
		start = start.next;
		temp.next = null;
		size -= 1;
		return ele;
	}
	
	int peek() {
		if(size==0) {
			System.out.println("Queue Underflow");
			return 0;
		}
		return start.data;
	}
	
	int size() {
		if(size==0) {
			System.out.println("Queue is Empty");
			return 0;
		}
		return size;
	}
	
	int rear() {
		if(size==0) {
			System.out.print("Queue Underflow");
			return 0;
		}
		return end.data;
	}
	
	boolean isEmpty() {
		if(size==0) return true;
		return false;
	}
}

public class ImplementQueueUsingLL {
	public static void main(String args[]) {
		QueueLL q = new QueueLL();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
	
		q.dequeue();
		q.dequeue();
		System.out.println(q.peek());
		System.out.println(q.rear());
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.rear());
	}
}
