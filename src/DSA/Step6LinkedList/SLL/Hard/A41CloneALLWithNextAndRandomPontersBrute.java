package DSA.Step6LinkedList.SLL.Hard;
import java.util.*;

class RNode{
	int data;
	RNode next;
	RNode random;
	
	RNode(int data,RNode next,RNode random){
		this.data = data;
		this.next = next;
		this.random = random;
	}
	
	RNode(int data){
		this.data = data;
		this.next = null;
		this.random = null;
	}
}

public class A41CloneALLWithNextAndRandomPontersBrute {
	static RNode CreatingCloneLL(RNode head) {
		if(head == null) return head;
		
		HashMap<RNode,RNode> mpp = new HashMap<>();
		
		RNode temp = head;
		
		while(temp!=null) {
			RNode Copy = new RNode(temp.data);
			mpp.put(temp, Copy);
			temp = temp.next;
		}
		
		temp = head; 
		RNode getcopy;
		
		while(temp!=null) {
			getcopy = mpp.get(temp);
			getcopy.next = mpp.get(temp.next);
			getcopy.random = mpp.get(temp.random);
			
			temp = temp.next;
		}
		
		return mpp.get(head);
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
