package DSA.Step6LinkedList.SLL.Easy;
import java.util.Scanner;

public class A42DeletionLastSLL {
	static Node CreationLL(int first,int s) {
		Scanner Sc = new Scanner(System.in);
		Node head = new Node(first,null);
		Node mover = head;
		
		for(int i=2;i<=s;i++) {
			int ele;
			ele = Sc.nextInt();
			
			Node temp = new Node(ele,null);
			mover.next = temp;
			mover = temp;
		}
		
		return head;
	}
	
	static Node DeletionatLast(Node head) {
		Node temp = head;
		if(head == null || head.next == null) {
			return null;
		}
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		
		temp.next = null;
		
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
		System.out.println("Enter size of LL = ");
		s = Sc.nextInt();
		
		int first;
		System.out.println("Enter elements of LL = ");
		first = Sc.nextInt();
		
		Node head = CreationLL(first,s);
		
		Node head1 = DeletionatLast(head);
		
		PrintLL(head1);
	}

}
