package DSA.Step6LinkedList.SLL.Hard;
import java.util.Scanner;
import java.util.*;

public class A61MergeTwoSortedSLLBrute {
	static Node CreationLL(int s1) {
		Scanner Sc = new Scanner(System.in);
		
		if(s1==0) return null;
		
		int first;
		System.out.println("Enter ele of LL = ");
		first = Sc.nextInt();
		
		Node head = new Node(first,null);
		Node mover = head;
		
		for(int i=1;i<s1;i++) {
			int ele;
			ele = Sc.nextInt();
			
			Node temp = new Node(ele,null);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	
	static Node MergeTwoSortedLL(Node head1,Node head2) {
		if(head1 == null || head2 == null) {
			if(head1!=null) return head1;
			else if (head2!=null) return head2;
			return null;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Node temp1 = head1;
		Node temp2 = head2;
		
		Node tail1 = null;
		
		while(temp1!=null && temp2!=null) { 
			
			if(temp1.next == null) {
				tail1 = temp1;
			}
			
			if(temp1.data<temp2.data) {
				list.add(temp1.data);
				temp1 = temp1.next;
			}
			else {
				list.add(temp2.data);
				temp2 = temp2.next;
			}
			
		}
		
		while(temp1!=null) {
			list.add(temp1.data);
			if(temp1.next == null) {
				tail1 = temp1;
			}
			temp1 = temp1.next;
		}
		while(temp2!=null) {
			list.add(temp2.data);
			temp2 = temp2.next;
		}
		
		tail1.next = head2;
		Node Put = head1;
		
		for(int i=0;i<list.size();i++) { 
			Put.data = list.get(i);
			Put = Put.next;
		}
		return head1;
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
		
		int s1;
		System.out.print("Enter size of LL 1 = ");
		s1 = Sc.nextInt();
		
		int s2;
		System.out.print("Enter size of LL 2 = ");
		s2 = Sc.nextInt();
		
		Node head1 = CreationLL(s1);
		Node head2 = CreationLL(s2);
		
		Node head3 = MergeTwoSortedLL(head1,head2);
		
		PrintLL(head3);
	}
}

