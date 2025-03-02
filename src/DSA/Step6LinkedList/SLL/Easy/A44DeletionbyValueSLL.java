package DSA.Step6LinkedList.SLL.Easy;
import java.util.Scanner;

public class A44DeletionbyValueSLL {
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
	
	static Node DeletionbyValue(Node head,int val,int s) {

		int cnt = 1;
		if(head == null) return head;
		
		Node temp = head;
		Node prev = head;
		
		while(val != temp.next.data) {
			temp = temp.next;
			prev = prev.next;
			cnt++;
			
			if(temp.next == null) {
				System.out.print("Not present in LL = ");
				return head;
			}
		}
		temp = temp.next;
		prev.next = temp.next;
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
		
		int value;
		System.out.println("Enter value to delete node = ");
		value = Sc.nextInt();
		
        Node head1 = DeletionbyValue(head,value,s);
		
		PrintLL(head1);
	}

}
