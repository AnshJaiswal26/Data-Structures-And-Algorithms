package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class B21Sort0s1s2sInSLLBrute{
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
	
	static Node SortSLL(Node head) {
		int Cnt0 = 0,Cnt1 = 0,Cnt2 = 0;
		
		Node temp = head;
		while(temp!=null) {
			if(temp.data == 0) Cnt0++;
			else if(temp.data == 1) Cnt1++;
			else Cnt2++;
			temp = temp.next;
		}
		
		temp = head;
		while(temp!=null) {
			if(Cnt0>0) {
				temp.data = 0;
				Cnt0--;
			}
			else if(Cnt1>0) {
				temp.data = 1;
				Cnt1--;
			}
			else {
				temp.data = 2;
				Cnt2--;
			}
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
		
		Node head = CreationLL(s);
		
		Node head1 = SortSLL(head);
		
		PrintLL(head1);
	}

}
