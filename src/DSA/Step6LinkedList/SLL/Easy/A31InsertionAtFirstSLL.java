package DSA.Step6LinkedList.SLL.Easy;
import java.util.Scanner;

public class A31InsertionAtFirstSLL {
	static Node CreationLL(int first,int s) {
		Scanner Sc = new Scanner(System.in);
		
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
	
	static Node InsertionAtFirstLL(Node head,int ele) {
		Node temp = new Node(ele,null);
		
		if(head==null) return temp;
		
		temp.next = head;
		head = temp;
		
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
		System.out.print("Enter size of LL = ");
		s = Sc.nextInt();
		
		int first;
		System.out.println("Enter ele of LL = ");
		first = Sc.nextInt();
		
		Node head = CreationLL(first,s);
		
		int ele;
		System.out.print("Enter element to insert at first = ");
		ele = Sc.nextInt();
		
		Node head1 = InsertionAtFirstLL(head,ele);
		
		PrintLL(head1);
	}
}
