package DSA.Step6LinkedList.SLL.Hard;
import java.util.Scanner;

public class A1ReverseNodesInKGroupSizeSLL {
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
	
	static void Reverse(Node head) {
		Node curr = head;
		Node prev = null;
		Node front = head;
		
		while(curr!=null) {
			front = curr.next;
			curr.next = prev;
			prev = curr;
			curr = front;
		}
	}
	static Node FindKthNode(Node temp,int k) {
		
		Node kthNode = temp;
		
		while(k>1 && kthNode!=null) {
			kthNode = kthNode.next;
			k--;
		}
		return kthNode;
	}
	
	static Node ReverseKGroup(Node head,int k) {
		if(head == null || head.next == null) return head;
		
		Node temp = head;
		Node lastnode = null;
		
		Node kthNode = temp;
		Node nextnode;
		
		
		while(temp!=null) {
			
			kthNode = FindKthNode(temp,k);
			
			if(kthNode == null) {
				if(lastnode!=null) lastnode.next = temp;
				break;
			}
			
			nextnode = kthNode.next;
			kthNode.next = null;
			
			Reverse(temp);
			
			if(temp == head) head = kthNode;
			else lastnode.next = kthNode;
			
			lastnode = temp;
			temp = nextnode;
			
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
		System.out.println("Enter size of LL = ");
		s = Sc.nextInt();
		
		int k;
		System.out.println("Enter k = ");
		k = Sc.nextInt();

		Node head = CreationLL(s);
		
        Node head1 = ReverseKGroup(head,k);
		
		PrintLL(head1);
	}

}



