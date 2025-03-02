package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class A92DeleteMiddleNodeSLLOptimal{
	static Node CreationLL(int s) {
		Scanner Sc = new Scanner(System.in);
		
		if(s==0) return null;
		
		int first;
		System.out.println("Enter ele of LL = ");
		first = Sc.nextInt();
		
		Node head = new Node(first,null);
		Node mover = head;
		
		for(int i=1;i<s;i++) {
			int ele;
			ele = Sc.nextInt();
			
			Node temp = new Node(ele,null);
			
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	static Node DeleteMiddle(Node head) {
		if(head == null || head.next == null) return null;
		
		Node slow = head;
		Node fast = head;
		
		// or fast = fast.next.next and remove inner if condition
		while(fast!=null && fast.next!=null) {
			
			if(fast!=head) {
				slow = slow.next;
			}
			
			fast = fast.next.next;
		}
		
		Node DNode = slow.next;
		slow.next = DNode.next;
		DNode.next = null;
		
		return head;
	}
	
	static void PrintLL(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter size LL = ");
		s=Sc.nextInt();
		
		Node head =CreationLL(s);
		
		Node head1 = DeleteMiddle(head);
		
		PrintLL(head1);
	}

}
