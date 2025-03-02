package DSA.Step6LinkedList.SLL.Hard;
import java.util.Scanner;

public class A62MergeTwoSortedSLLOptimal{
	static Node CreationLL(int s1) {
		Scanner Sc = new Scanner(System.in);
		
		if(s1==0) return null;
		
		int first;
		System.out.println("Enter ele of LL = ");
		first = Sc.nextInt();
		
		Node head = new Node(first,null);
		Node mover = head;
		
		for(int i=1;i<s1;i++) {
			int ele;
			ele = Sc.nextInt();
			
			Node temp = new Node(ele,null);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	
	static Node MergeTwoSortedLL(Node head1,Node head2) {
		if(head1 == null || head2 == null) {
			if(head1!=null) return head1;
			else if (head2!=null) return head2;
			return null;
		}
		
		Node Dnode = new Node(-1,null);
		Node temp = Dnode;
		
		Node lefthead = head1;
		Node righthead = head2;
		
		while(lefthead!=null && righthead!=null) {
			if(lefthead.data <= righthead.data) {
				temp.next = lefthead;
				temp = lefthead;
				lefthead = lefthead.next;
			}
			else {
				temp.next = righthead;
				temp = righthead;
				righthead = righthead.next;
			}
		}
		
		while(lefthead!=null) {
			temp.next = lefthead;
			temp = lefthead;
			lefthead = lefthead.next;
		}
		while(righthead!=null) {
			temp.next = righthead;
			temp = righthead;
			righthead = righthead.next;
		}
		
		Node Newhead = Dnode.next;
		
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
		
		int s1;
		System.out.print("Enter size of LL 1 = ");
		s1 = Sc.nextInt();
		
		int s2;
		System.out.print("Enter size of LL 2 = ");
		s2 = Sc.nextInt();
		
		Node head1 = CreationLL(s1);
		Node head2 = CreationLL(s2);
		
		Node head3 = MergeTwoSortedLL(head1,head2);
		
		PrintLL(head3);
	}
}

