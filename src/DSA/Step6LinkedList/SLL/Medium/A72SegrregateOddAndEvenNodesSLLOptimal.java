package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class A72SegrregateOddAndEvenNodesSLLOptimal{
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
	
	static Node SegrregateOddEven(Node head) {
		if(head == null && head.next == null) {
			return head;
		}
		
		Node odd = head;
		Node even = head.next;
		Node evenhead = head.next;
		
		while(even!=null && even.next!=null) {
			odd.next = odd.next.next;
			odd = odd.next;
			
			even.next = even.next.next;
			even = even.next;
		}
		odd.next = evenhead;
		 
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
		
		Node head1 = SegrregateOddEven(head);
		
		PrintLL(head1);
	}

}
