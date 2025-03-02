package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class B12SortASLLOptimal{
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
	
	static Node Middle(Node head) {
		if(head == null || head.next == null) return head;
		
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null) {
			
			if(fast!=head) {
				slow = slow.next;
			}
			fast = fast.next.next;
		}
		
		if(fast == null) {
			 return slow;
		}
		
		return slow.next;
	}
	static Node Merger(Node lefthead,Node righthead) {
		Node temp = new Node(-1,null);
		Node DNode = temp;
		
		while(lefthead!=null && righthead!=null) {
			if(lefthead.data<=righthead.data) {
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
		
		Node Del = DNode;
		DNode = DNode.next; 
		Del.next = null;
		
		return DNode;
	}
	
	static Node MergeSort(Node head){
		if(head == null || head.next == null ) return head;
		Node mid = Middle(head);
		Node lefthead = head;
		Node righthead = mid.next;
		mid.next = null;
		
		lefthead = MergeSort(lefthead);
		righthead = MergeSort(righthead);
		lefthead = Merger(lefthead,righthead);
		
		return lefthead;
	}
	
	static Node SortSLL(Node head) {
		
		Node NewHead = MergeSort(head);
	
		return NewHead;
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
