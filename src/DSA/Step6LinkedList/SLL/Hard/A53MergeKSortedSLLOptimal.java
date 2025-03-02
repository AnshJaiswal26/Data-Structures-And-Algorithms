package DSA.Step6LinkedList.SLL.Hard;
import java.util.Scanner;
import java.util.*;

class Node1{
	int data;
	Node1 next;
	
	Node1(int data,Node1 next){
		this.data = data;
		this.next = next;
	}
}

class Pair{
	int data;
	Node1 node;
	
	Pair(int data,Node1 node){
		this.data = data;
		this.node = node;
	}
}

public class A53MergeKSortedSLLOptimal{
	static Node1 CreationLL(int n) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter size of "+n+" LL = ");
		s = Sc.nextInt();
		
		if(s==0) return null;
		
		int first;
		System.out.println("Enter ele of "+n+" LL = ");
		first = Sc.nextInt();
		
		Node1 head = new Node1(first,null);
		Node1 mover = head;
		
		for(int i=1;i<s;i++) {
			int ele;
			ele = Sc.nextInt();
			
			Node1 temp = new Node1(ele,null);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	static List<Node1> CreateKLL(int k) {
		List<Node1> list = new ArrayList<>();
		
		for(int i=1;i<=k;i++) {
			Node1 head = CreationLL(i);
			list.add(head);
		}
		return list;
	}
	
	static Node1 MergeKLL(int k) {
		if(k==0) return null;
		
		List<Node1> list = CreateKLL(k);
		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> Integer.compare(a.data,b.data));
		
		for(Node1 temp : list) { 
			pq.add(new Pair(temp.data,temp));
		}
		
		Node1 Dnode = new Node1(-1,null);
		Node1 mover = Dnode;
		Pair get;
		
		while(!pq.isEmpty()) {	
			get = pq.poll();  
			mover.next = get.node;
			mover = get.node;
			
			if(get.node.next!=null) { 
				pq.add(new Pair(get.node.next.data,get.node.next));
			}
		}
		
		mover.next = null;
		
		return Dnode.next;
	}
	
	static void PrintLL(Node1 head) {
		Node1 temp = head;
		
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
		
		Node1 head = MergeKLL(k);
		
		PrintLL(head);
	}
}
