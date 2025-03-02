package DSA.Step6LinkedList.SLL.Medium;
import java.util.HashMap;
import java.util.Scanner;

public class A51FindLengthOfLoopSLLBrute {
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
			if(cnt==3) {
				temp = mover;
			}
			
			if(cnt==9) { 
				mover.next = temp;
			}
		}
		return head;
	}
	
	static int DetectLengthOfLoop(Node head) {
		HashMap<Node,Integer> mpp = new HashMap<>();
		
		Node temp = head;
		int LCnt = 1;
		
		while(temp!=null) {
			if(mpp.containsKey(temp)) {
				int LoopLength = LCnt-mpp.get(temp);
				return LoopLength;
			}
			mpp.put(temp, LCnt);
			temp = temp.next;
			LCnt++;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		Node head = CreationLoopLL();
		
		int LoopLength = DetectLengthOfLoop(head);
		System.out.print("Length of loop is "+LoopLength);
	}

}
