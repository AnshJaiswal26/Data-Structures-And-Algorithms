package DSA.Step6LinkedList.SLL.Easy;
import java.util.Scanner;

public class A33InsertionAtPosSLL {
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
	
	static Node InsertionAtPosLL(Node head,int ele,int pos,int s) {
		
		int cnt = 0;
		
		Node temp = new Node(ele,null);
		Node mover = head;
		
		if(pos==0) {
			System.out.print("Enter Correct position to insert element in LL = ");
			return head;
		}
		
		if(head==null) {
			if(pos == 1) {
				return temp;
			}
			else{
				System.out.println("Enter correct position!!");
				System.out.print("You Exced length of LL = ");
				return head;
			}
		}
		else if(pos==1) {
			temp.next = mover;
			head = temp;
			return head;
		}
		
		if(pos>s) {
			System.out.println("Enter correct position!!");
			System.out.print("You Exced length of LL = ");
			return head;
		}
		
		while(cnt<pos-2) {
			mover = mover.next;
			cnt++;
		}
		temp.next = mover.next;
		mover.next = temp;
		
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
		
		Node head = CreationLL(s);
		
		int ele;
		System.out.print("Enter element to insert at position = ");
		ele = Sc.nextInt();
		
		int pos;
		System.out.print("Enter positon to insert element = ");
		pos = Sc.nextInt();
		
		Node head1 = InsertionAtPosLL(head,ele,pos,s);
		
		PrintLL(head1);
	}
}
