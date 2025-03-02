package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class A11FindTheMidEleOfSLLBrute {
	static Node CreationLL(int s) {
		Scanner Sc = new Scanner(System.in);
		
		int first;
		System.out.println("Enter ele of LL = ");
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
	
	static Node FindMiddle(Node head,int s) {
		int mid = (s/2)+1;
		int cnt=1;
		
		Node temp = head;
		
		while(cnt!=mid) {
			temp = temp.next;
			cnt++;
		}
		return temp;
	}
	
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter size LL = ");
		s=Sc.nextInt();
		
		Node head = CreationLL(s);
		
		Node midele = FindMiddle(head,s);
		System.out.print("Mid ele is "+midele.data);
	}

}
