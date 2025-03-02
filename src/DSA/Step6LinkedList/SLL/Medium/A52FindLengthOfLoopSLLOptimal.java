package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class A52FindLengthOfLoopSLLOptimal {
	static Node CreationLoopLL() {
        Scanner Sc = new Scanner(System.in);
		
        int l;
        System.out.print("Enter Size of LL = ");
        l = Sc.nextInt();
        
        int p;
        System.out.print("Press 1 to create loop or pess 0 to creater linear LL = ");
        p = Sc.nextInt();
        
        int o = 0;
        if(p==1) {
             System.out.print("Enter node pos from where you want to create a loop = ");
             o = Sc.nextInt();
        }
        
        int first;
        System.out.println("Enter ele of LL = ");
        first = Sc.nextInt();
        
		Node head = new Node(first,null);
		Node mover = head;
		Node temp = head;
		int cnt = 1;
		
		while(cnt!=l) {
			int ele;
			ele = Sc.nextInt();
			
			Node temp1 = new Node(ele,null);
			mover.next = temp1;
			mover = temp1;
			
			cnt++;
			if(cnt==o) {
				// create loop from any node
				temp = mover;
			}
			
			if(p==1) {
				if(cnt==l) { 
					mover.next = temp;
					break;
				}
			}
		}
		return head;
	}
	
	static int LengthOfLoop(Node slow,Node fast) {
		int LCnt = 1;
		
		while(fast.next!=slow) {
			fast = fast.next;
			LCnt++;
		}
		
		return LCnt;
	}
	
	static int DetectLengthOfLoop(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) {
				int LoopLength = LengthOfLoop(slow,fast);
				return LoopLength;
			}
		}
		return 0;
	}
	
	public static void main(String args[]) {
		Node head = CreationLoopLL();
		
		int LoopLength = DetectLengthOfLoop(head);
		System.out.print("Length of loop is "+LoopLength);
	}

}
