package DSA.Step6LinkedList.SLL.Hard;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class CNode{
	int data;
	CNode next;
	CNode child;
	
	CNode(int data,CNode next,CNode child){
		this.data = data;
		this.next = next;
		this.child = child;
	}
}

public class A31FlatteningLLBrute {
	static CNode CreationCLL(int s){
		Scanner Sc = new Scanner(System.in);
		
		if(s==0) {
			return null;
		}
		
		int first;
		System.out.print("Enter "+1+" parent node = ");
		first = Sc.nextInt();
		
		CNode head = new CNode(first,null,null);
		CNode mover = head;
		CreateChild(head);
		
		for(int i=1;i<s;i++) {
			int ele;
			System.out.print("Enter "+(1+i)+" parent node = ");
			ele = Sc.nextInt();
			
			CNode temp1 = new CNode(ele,null,null);
			CreateChild(temp1);
			
			mover.next = temp1;
			mover = temp1;
		}
		return head;
	}
	
	static CNode CreateChild(CNode head) {
		Scanner Sc = new Scanner(System.in);
		
		int cs;
		System.out.print("Enter no. of childs of node "+head.data+" = ");
		cs = Sc.nextInt();
		
		if(cs==0) return null;
		
		CNode mover = head;
		
		for(int i=0;i<cs;i++) {
			int ele;
			System.out.print("Enter child node "+(i+1) +" = ");
			ele = Sc.nextInt();
			
			CNode temp1 = new CNode(ele,null,null);
			
			mover.child = temp1;
			mover = temp1;
		}
		return head;
	}
	
   static void PrintPLL(CNode Newhead) {
		
		CNode temp1 = Newhead;
		System.out.println("Parent Nodes");
		while(temp1!=null) {
			System.out.print(temp1.data+"-->");
			temp1 = temp1.next;
			if(temp1==null)System.out.println("X");
		}
		
		temp1 = Newhead;
		while(temp1!=null) {
			System.out.println("Child nodes of = "+temp1.data);
			PrintCLL(temp1);
			temp1 = temp1.next;
		}
	}
	
	static void PrintCLL(CNode Newhead) {
		
		CNode temp1 = Newhead;
		
		while(temp1!=null) {
			System.out.print(temp1.data+"-->");
			temp1 = temp1.child;
			if(temp1==null)System.out.println("X");
		}
	}
	
	static CNode Flattening(CNode head) {
		List<Integer> list = new ArrayList<>();
		
		CNode temp = head;
		CNode t2 = temp;
		
		while(temp!=null) {
			while(t2!=null) {
				list.add(t2.data);
				t2 = t2.child;
			}
			temp = temp.next;
			t2 = temp;
		}
		
		Collections.sort(list);
		
		CNode Dnode = new CNode(-1,null,null);
		CNode mover = Dnode;
		
		for(int it : list) {
			CNode NewCLL = new CNode(it,null,null);
			mover.child = NewCLL;
			mover = NewCLL;
		}
		
		return Dnode.child;
	}
	
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int s;
		System.out.print("Enter Size of parent LL = ");
		s = Sc.nextInt();
		
		CNode head = CreationCLL(s);
		PrintPLL(head);
		
		CNode head1 = Flattening(head);
		PrintCLL(head1);
	}

}

