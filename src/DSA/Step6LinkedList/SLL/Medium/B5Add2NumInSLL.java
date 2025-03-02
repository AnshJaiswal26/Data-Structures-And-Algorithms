package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class B5Add2NumInSLL {
	static Node CreationLL(int n) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter size of "+n+" LL = ");
		s=Sc.nextInt();
		
		if(s==0) return null;
		
		int first;
		System.out.println("Enter ele of "+n+" LL = ");
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
	
	static void PrintLL(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	static Node SumoftwoLLinReverse(Node h1,Node h2) {
		
		Node temp1 = h1;
		Node temp2 = h2;
		
//		int sum = 0;
		int carry = 0;
		
		Node Dnode = new Node(-1,null);
		Node res = Dnode;
		
		while(temp1!=null || temp2!=null) {
			int sum = carry;
			if(temp1!=null) sum+=temp1.data;
			if(temp2!=null) sum+=temp2.data;
			carry = sum/10;
			
			Node New = new Node(sum%10,null);
			res.next = New;
			res = New;
			
			if(temp1!=null) temp1 = temp1.next;
			if(temp2!=null) temp2 = temp2.next;
			
		}
		
// 		Or we can write
		
//		while(temp1 !=null && temp2!=null) {
//			
//			sum = temp1.data + temp2.data + carry;
//			carry = sum/10;
//			sum = sum%10;
//					
//			Node New = new Node(sum,null);
//			res.next = New;
//			res = New;
//			
//			temp1 = temp1.next;
//			temp2 = temp2.next;
//		}
//		
//		while(temp1!=null) {
//			sum = temp1.data + carry;
//			
//			carry = sum/10;
//			sum = sum%10;
//
//			Node New = new Node(sum,null);
//			res.next = New;
//			res = New;
//			
//			temp1 = temp1.next;
//		}
//		
//		while(temp2!=null) {
//			sum = temp2.data + carry;
//			
//			carry = sum/10;
//			sum = sum%10;
//
//			Node New = new Node(sum,null);
//			res.next = New;
//			res = New;
//			
//			temp2 = temp2.next;
//		}
		
		if(carry >= 1) {
			Node carr = new Node(carry,null);
			res.next = carr;
		}
		
		return Dnode.next;
	}
	
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		Node head1 = CreationLL(1);
		Node head2 = CreationLL(2);
		
		Node newhead = SumoftwoLLinReverse(head1,head2);
		
		PrintLL(newhead);
	}

}