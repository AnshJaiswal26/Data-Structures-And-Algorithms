package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class B42Add1ToNumRepresentedBySLLOptimal{
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

	static int Add(Node head) {
		if(head == null) return 1;
		
		int carry = Add(head.next);
		
		Node temp = head;
		temp.data = temp.data+carry;
		
		if(temp.data == 10) {
			temp.data = 0;
			return carry;
		}
		else {
			carry = 0;
		} 	
		return carry;
	}
	
	static Node Add1tonumrepresentedbtSLL(Node head) {
		int carry = Add(head);
		if(carry == 1) {
			Node New = new Node(carry,null);
			New.next = head;
			return New;
		}
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
		
		Node head = CreationLL(s);
		
		Node head1 = Add1tonumrepresentedbtSLL(head);
		
		PrintLL(head1);
	}

}

