package DSA.Step6LinkedList.SLL.Hard;
import java.util.Scanner;
import java.util.*;


public class A51MergeKSortedSLLBrute{
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
	
	static Node MergeKLL(int k) {
		if(k==0) return null;
		
		List<Node> list = CreateKLL(k);
		List<Integer> list2 = new ArrayList<>(); 
		
		for(Node temp : list) {
			while(temp!=null) {
				list2.add(temp.data);
				temp = temp.next;
			}
		}
		
        Collections.sort(list2);
		
		Node Dnode = new Node(-1,null);
		Node mover = Dnode;
		
		for(int it : list2) {
			Node newhead = new Node(it,null);
			mover.next = newhead;
			mover = newhead;
		}
		
		return Dnode.next;
		
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
