package DSA.Step6LinkedList.SLL.Hard;
import java.util.Scanner;

public class A32FlatteningLLOptimal{
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
	
    static CNode Merger(CNode l1,CNode l2) {
    	CNode Dnode = new CNode(-1,null,null);
    	CNode temp = Dnode;
    	
    	while(l1!=null && l2!=null) {
    		if(l1.data<=l2.data) {
    			temp.child = l1;
    			temp = l1;
    			l1 = l1.child;
    		}
    		else {
    			temp.child = l2;
    			temp = l2;
    			l2 = l2.child;
    		}
    		temp.next = null;
    	}
    	
    	while(l1!=null) {
    		temp.child = l1;
			temp = l1;
			l1 = l1.child;
			temp.next = null;
    	}
    	while(l2!=null) {
    		temp.child = l2;
			temp = l2;
			l2 = l2.child;
			temp.next = null;
    	}
    	
    	return Dnode.child;
    }
    
	static CNode Flattening(CNode head) {
		if(head == null || head.next == null) return head;
		
		CNode Newhead = Flattening(head.next);
		
		CNode Mergehead = Merger(head, Newhead);
		
		return Mergehead;
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

// 1 3 5 2 4 6 5 8 9 7 9 11
// 1 2 3 4 5 5 6 7 8 9 9 11