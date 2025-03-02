package DSA.Step6LinkedList.SLL.Easy;
import java.util.Scanner;

public class A41DeletionHeadSLL {
	static Node LLCreation(int first,int s) {
		Scanner Sc = new Scanner(System.in);
		
		Node head = new Node(first,null);
		Node mover = head;
		
		for(int i=2;i<=s;i++) {
			int ele;
			ele = Sc.nextInt();
			
			Node temp = new Node(ele,null);
			
			mover.next = temp;
			
			mover=temp;
		}
		
		return head;
	}
	

static Node DeletionHead(Node head,int first){
	if(head==null) return head;
	head = head.next;
	return head;
}

	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter size of LL = ");
		s = Sc.nextInt();
		
		int first;
		System.out.println("Enter elements of LL = ");
		first = Sc.nextInt();
		
		Node head = LLCreation(first,s);
		Node temp = head;
		
		System.out.println();
		System.out.println("LL Before Deletion of first node ");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
			
		Node temp1 = DeletionHead(head,first);
		System.out.println();
		System.out.println("LL after Deletion of first node ");
		while(temp1!=null) {
			System.out.print(temp1.data+" ");
			temp1 = temp1.next;
		}
	}

}
