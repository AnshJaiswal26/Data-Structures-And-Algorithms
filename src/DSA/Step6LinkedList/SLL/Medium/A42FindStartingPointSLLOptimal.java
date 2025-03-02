package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class A42FindStartingPointSLLOptimal{
	static Node CreationLoopLL() {
        Scanner Sc = new Scanner(System.in);
		
        int first;
        System.out.println("Enter ele of LL = ");
        first = Sc.nextInt();
        
		Node head = new Node(first,null);
		Node mover = head;
		Node temp = head;
		int cnt = 1;
		
		while(mover.next!=temp) {
			int ele;
			ele = Sc.nextInt();
			
			Node temp1 = new Node(ele,null);
			mover.next = temp1;
			mover = temp1;
			
			cnt++;
			if(cnt==4) {
				temp = mover;
			}
			
			if(cnt==10) { 
				mover.next = temp;
			}
		}
		return head;
	}
	
	static Node DetectStartingPoint(Node slow,Node fast,Node head) {
		slow = head;
		
		while(slow!=fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	
	static Node DetectLoop(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) {
				Node Start = DetectStartingPoint(slow,fast,head);
				return Start;
			}
		}
		
		return null;
	}
	
	public static void main(String args[]) {
		Node head = CreationLoopLL();
		
		Node Start = DetectLoop(head);
		System.out.print("Starting Node is "+Start.data);
	}

}
