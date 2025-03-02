package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class A62CheckSLLIsPalindromeOrNotOptimal {
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
	
	static Node Middle(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
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
	static boolean CheckPalindromeOrNot(Node head1) {
		Node mid = Middle(head1);
		Node head2 = Reverse(mid.next);
		
		Node temp1 = head1;
		Node temp2 = head2;
		
		while(temp2!=null) {
			
			if(temp1.data!=temp2.data) {
				Reverse(head2);
				return false;
			}
			
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		Reverse(head2);
		return true;
	}

	static void PrintDLL(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter Size of LL = ");
		s = Sc.nextInt();
		
		Node head = CreationLL(s);
		boolean ans = CheckPalindromeOrNot(head);
		
		if(ans == true) {
			System.out.println("LL is palindrome");
		}
		else {
			System.out.println("LL is not palindrome");
		}
		
		PrintDLL(head);
	}
}
