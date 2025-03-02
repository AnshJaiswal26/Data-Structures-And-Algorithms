package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;
import java.util.Stack;

public class A61CheckSLLIsPalindromeOrNotBrute {
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
	
	static boolean CheckPalindromeOrNot(Node head) {
		Stack<Integer> st = new Stack<>();
		
		Node temp = head;
		
		while(temp!=null) {
			st.push(temp.data);
			temp = temp.next;
		}
		
		temp = head;
		
		while(temp!=null) {
			if(temp.data != st.pop()) {
				return false;
			}
			temp = temp.next;
		}
		
		return true;
	}

	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter Size of LL = ");
		s = Sc.nextInt();
		
		Node head = CreationLL(s);
		boolean ans = CheckPalindromeOrNot(head);
		
		if(ans == true) {
			System.out.print("LL is palindrome");
		}
		else {
			System.out.print("LL is not palindrome");
		}
	}
}
