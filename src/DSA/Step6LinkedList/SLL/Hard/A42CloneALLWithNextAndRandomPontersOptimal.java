package DSA.Step6LinkedList.SLL.Hard;

public class A42CloneALLWithNextAndRandomPontersOptimal{
	static RNode CreatingCloneLL(RNode head) {
		if(head == null) return head;
		
		RNode temp = head;
		
		while(temp!=null) {
			
			RNode copy = new RNode(temp.data);
			copy.next = temp.next;
			temp.next = copy;
			
			temp = temp.next.next;
		}
		
		temp = head;
		RNode tempcopy;
		
		while(temp!=null) {
			tempcopy = temp.next;
			
			if(temp.random!=null) tempcopy.random = temp.random.next;
			else tempcopy.random = null;		
			
			temp = temp.next.next;
		}
		
		RNode Dnode = new RNode(-1);
		RNode res = Dnode;
		temp = head;
		
		while(temp!=null) {
			res.next = temp.next;
			temp.next = temp.next.next;
			
			res = res.next;
			temp = temp.next;
		}
		
		return Dnode.next;
	}
	
	static void PrintCloneLL(RNode head) {
		RNode temp = head;
		
		System.out.println("Copy of original random and next pointers LL");
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
			if(temp==null) System.out.println("x");
		}
		
		System.out.println("Random pointers of each node of copy LL");
		temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			if(temp.random!=null) System.out.println(temp.random.data);
			else System.out.println("x");
			temp = temp.next;
		}
	}
	public static void main(String args[]) {
		
		RNode head = new RNode(7);
		head.next = new RNode(13);
		head.next.next = new RNode(11);
		head.next.next.next = new RNode(10);
		head.next.next.next.next = new RNode(1);
		
		head.random = null; // 7-->null
		head.next.random = head; // 13-->7
		head.next.next.random = head.next.next.next.next;// 11-->1
		head.next.next.next.random = head.next.next;// 10-->11
		head.next.next.next.next.random = head;// 1-->7
		
		RNode head1 = CreatingCloneLL(head);
		PrintCloneLL(head1);
	}

}
