package DSA.Step6LinkedList.SLL.Medium;
import java.util.HashMap;
import java.util.Scanner;

public class A41FindStartingPointSLLBrute {
	static Node CreationLoopLL() {
        Scanner Sc = new Scanner(System.in);
		
        int first;
        System.out.println("Enter ele of LL = ");
        first = Sc.nextInt();
        
		Node head = new Node(first,null);
		Node mover = head;
		Node temp = head;
		int cnt = 1;
		
		while(mover.next!=temp) {
			int ele;
			ele = Sc.nextInt();
			
			Node temp1 = new Node(ele,null);
			mover.next = temp1;
			mover = temp1;
			
			cnt++;
			if(cnt==4) {
				temp = mover;
			}
			
			if(cnt==10) { 
				mover.next = temp;
			}
		}
		return head;
	}
	
	static Node DetectStartingPointLoop(Node head) {
		HashMap<Node,Integer> mpp = new HashMap<>();
		
		Node temp = head;
		
		while(temp!=null) {
			if(mpp.containsKey(temp)) {
				return temp;
			}
			mpp.put(temp, 1);
			temp = temp.next;
		}
		return null;
	}
	
	public static void main(String args[]) {
		Node head = CreationLoopLL();
		
		Node ans = DetectStartingPointLoop(head);
		System.out.print("Starting Node is "+ans.data);
	}

}
