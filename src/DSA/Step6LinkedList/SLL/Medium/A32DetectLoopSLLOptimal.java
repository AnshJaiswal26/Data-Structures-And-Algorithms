package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class A32DetectLoopSLLOptimal{
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
			if(cnt==3) {
				temp = mover;
			}
			
			if(cnt==9) { 
				mover.next = temp;
			}
		}
		return head;
	}
	
	static boolean DetectLoop(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null) {
			
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast==slow) {
				return true;
			}
			
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		Node head = CreationLoopLL();
		
		boolean ans = DetectLoop(head);
		System.out.print(ans);
	}

}
