package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;
import java.util.*;

public class A71SegrregateOddAndEvenNodesSLLBrute{
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
		if(head == null || head.next == null) return head;
		
		List<Integer> list = new ArrayList<>();
		
		Node temp = head;
		while(temp!=null && temp.next!=null) {
			list.add(temp.data);
			temp = temp.next.next;
		}
		if(temp!=null) list.add(temp.data);
		
		temp = head.next;
		while(temp!=null && temp.next!=null) {
			list.add(temp.data);
			temp = temp.next.next;
		}
		if(temp!=null) list.add(temp.data);

		temp = head;
		for(int i=0;i<list.size();i++) {
			temp.data = list.get(i);
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
		
		Node head1 = SegrregateOddEven(head);
		
		PrintLL(head1);
	}

}
