package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class B22Sort0s1s2sInSLLOptimal{
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
	
	static Node SortSLL(Node head) {
		if(head == null || head.next == null) return head;
		
		Node Zerohead = new Node(-1,null);
		Node zero = Zerohead;
		
		Node Onehead = new Node(-1,null);
		Node one = Onehead;
		
		Node Twohead = new Node(-1,null);
		Node two = Twohead;
		
		Node temp = head;
		
		while(temp!=null) {
			if(temp.data == 0) {
				zero.next = temp;
				zero = temp;
			}
			else if(temp.data == 1) {
				one.next = temp;
				one = temp;
			}
			else {
				two.next = temp;
				two = temp;
			}
			temp = temp.next;
		}
		
		
//		if(Onehead.next!=null) {
//			zero.next = Onehead.next;
//		}
//		else{
//			zero.next = Twohead.next;
//		}
		
		zero.next = (Onehead.next!=null) ? Onehead.next : Twohead.next;
		one.next = Twohead.next;
		two.next = null;
		
		return Zerohead.next;
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
		
		Node head = CreationLL(s);
		
		Node head1 = SortSLL(head);
		
		PrintLL(head1);
	}

}
