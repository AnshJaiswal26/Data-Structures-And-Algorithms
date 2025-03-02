package DSA.Step6LinkedList.SLL.Hard;
import java.util.Scanner;

public class A2RotateASLLByK {
	static Node CreationLL(int s) {
		Scanner Sc = new Scanner(System.in);
		
		int first;
		System.out.println("Enter elements of LL = ");
		first = Sc.nextInt();
		
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
	
	static Node RotateByK(Node head,int k) {
		if(head == null || head.next == null) return head;
		
		Node tail = head;
		
		int LLlen=1;
		while(tail.next!=null) {
			tail = tail.next;
			LLlen++;
		}
		
		if(k%LLlen == 0) return head;
		
		k = k%LLlen;
		int cnt = LLlen-k;
		
		Node temp = head;
		while(cnt>1) {
			temp = temp.next;
			cnt--;
		}
		
		tail.next = head;
		head = temp.next;
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
		
		int k;
		System.out.println("Enter k = ");
		k = Sc.nextInt();

		Node head = CreationLL(s);
		
        Node head1 = RotateByK(head,k);
		
		PrintLL(head1);
	}

}




