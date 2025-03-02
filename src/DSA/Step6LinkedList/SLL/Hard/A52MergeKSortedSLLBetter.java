package DSA.Step6LinkedList.SLL.Hard;
import java.util.Scanner;
import java.util.*;


public class A52MergeKSortedSLLBetter{
	static Node CreationLL(int n) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter size of "+n+" LL = ");
		s = Sc.nextInt();
		
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
	
	static List<Node> CreateKLL(int k) {
		List<Node> list = new ArrayList<>();
		
		for(int i=1;i<=k;i++) {
			Node head = CreationLL(i);
			list.add(head);
		}
		return list;
	}
	
	static Node MergeTwo(Node h1,Node h2) {
		if(h1 == null || h2 == null) {
			if(h1!=null) return h1;
			else if (h2!=null) return h2;
			return null;
		}
		
		Node Dnode = new Node(-1,null);
		Node temp = Dnode;
		
		Node t1 = h1;
		Node t2 = h2;
		
		while(t1!=null && t2!=null) {
			if(t1.data<=t2.data) {
				temp.next = t1;
				temp = t1;
				t1 = t1.next;
			}
			else {
				temp.next = t2;
				temp = t2;
				t2 = t2.next;
			}
		}		
		while(t1!=null) {
			temp.next = t1;
			temp = t1;
			t1 = t1.next;
		}
		while(t2!=null) {
			temp.next = t2;
			temp = t2;
			t2 = t2.next;
		}
		
		return Dnode.next;
	}
	
	static Node MergeKLL(int k) {
		List<Node> list = CreateKLL(k);
		
		Node newhead = list.get(0);
		
		for(int i=1;i<list.size();i++) {		
			newhead = MergeTwo(newhead,list.get(i));
		}
	
		return newhead;
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
		
		int k;
		System.out.print("How many LL you want to create = ");
		k = Sc.nextInt();
		
		Node head = MergeKLL(k);
		
		PrintLL(head);
	}
}
