package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class A81RemoveNthNodeOfSLLFromEndBrute{
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
	
	static Node RemoveNthPosFromEnd(Node head) {
		
		if(head == null || head.next == null) return null;
		
		int N = 1;
		int Cnt=0;
		
		Node temp = head;
		
		while(temp!=null) {
			temp = temp.next;
			Cnt++;
		}
		
		temp = head;
		if(Cnt==N) {
			head = head.next;
			temp.next = null;
			return head;
		}
		
		temp = head;
		int S = Cnt-N;
		while(temp!=null) {
			S--;
			if(S==0) break;
			temp = temp.next;
		}
		
		Node NthNode = temp.next;
		temp.next = NthNode.next;
		NthNode.next = null;
		
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
		
		Node head1 = RemoveNthPosFromEnd(head);
		
		PrintLL(head1);
	}

}
