package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;
import java.util.Stack;

//class Node{
//	int data;
//	Node next;
//	
//	Node(int data,Node next){
//		this.data = data;
//		this.next = next;
//	}
//}

public class A21ReverseSLLBruteIterative{
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
		Stack<Integer> st = new Stack<>();
		
		System.out.println(st.isEmpty());
		
		Node temp = head;
		while(temp!=null) {
			st.push(temp.data);
			temp = temp.next;
		}
		
		temp = head;
		while(temp!=null) {
			temp.data = st.pop();
			temp = temp.next;
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
		
		Node head =CreationLL(s);
		
		Node head1 = ReverseLL(head);
		
		PrintLL(head1);
	}

}
