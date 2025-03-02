package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class A22ReverseSLLOptimalIterative{
	static Node CreationLL(int s) {
		Scanner Sc = new Scanner(System.in);
		
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
	
	static Node ReverseLL(Node head) {
		Node temp = head;
		Node prev = null;
		Node front = head;
		
		while(temp!=null) {
			front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;		
		}
		
		return prev;
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
		
		Node head1 = ReverseLL(head);
		
		PrintLL(head1);
	}

}
