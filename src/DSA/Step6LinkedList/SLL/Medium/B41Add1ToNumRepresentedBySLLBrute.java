package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class B41Add1ToNumRepresentedBySLLBrute{
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
	static Node Reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node front = head;
		
		while(curr!=null) {
			front = front.next;
			curr.next = prev;
			prev = curr;
			curr = front;
		}
		return prev;
	}
	static Node ReverseAndAdd(Node head) {
		Node Newhead = Reverse(head); 
		Node temp = Newhead;
		int carry = 1;
		
		while(temp!=null) {
			if((temp.data+carry)==10) {
				temp.data = 0;
			}
			else {
				temp.data = temp.data+1;
				carry = 0;
				break;
			}
			temp = temp.next;
		}
		
		if(carry == 1) {
			Node head1 = Reverse(Newhead);
			Node New = new Node(carry,null);
			
			New.next = head1;
			return New;
		}
		
		Node head2 = Reverse(Newhead);
		return head2;
	}
	static Node Add1tonumrepresentedbtSLL(Node head) {
		Node Newhead = ReverseAndAdd(head);
		return Newhead;
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
		
		Node head1 = Add1tonumrepresentedbtSLL(head);
		
		PrintLL(head1);
	}

}

