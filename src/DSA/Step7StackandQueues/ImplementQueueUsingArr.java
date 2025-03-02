package DSA.Step7StackandQueues;

class QueueArr{
	int size  = 8;
	int[] Q = new int[size];
	int start = -1;
	int end = -1;
	int currsize = 0;
	
	void enqueue(int x){
		if(currsize==size) {
			System.out.print("Queue Overflow");
			return ;
		}
		if(currsize == 0) start = end = 0;
		else end = (end+1)%size;
		
		Q[end] = x;
		currsize = currsize+1;

		return;
	}
	
	int  dequeue() {
		if(currsize==0) {
			System.out.print("Queue Underflow");
			return 0; 
		}
		int ele = Q[start];
		
		start = (start+1)%size;
		
		if(currsize==1) {
			start = -1;
			end = -1;
		}
		
		currsize--;
		return ele;
	}
	
	int peek() {
		if(currsize==0) {
			System.out.print("Queue is Empty");
			return 0;
		}
		return Q[start];
	}
	
	int size() {
		return currsize;
	}
	
	int rear() {
		return Q[end];
	}
	
	boolean isEmpty() {
		if(currsize==0) return true;
		return false;
	}
	
	boolean isFull() {
		if(currsize==size) return true;
		return false;
	}
}

   
public class ImplementQueueUsingArr {
	public static void main(String args[]) {
		QueueArr q = new QueueArr();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(9);
		q.enqueue(10);
		System.out.println(q.peek());
		System.out.println(q.rear());
		
	}
}
