package DSA.Step6LinkedList.DLL.Easy;
import java.util.Scanner;

public class A44DeletionByValueDLL {
	static DNode CreationDLL(int s){
		Scanner Sc = new Scanner(System.in);
		
		if(s==0) {
			return null;
		}
		
		int first;
		System.out.println("Enter ele of DLL = ");
		first = Sc.nextInt();
		
		DNode head = new DNode(first,null,null);
		DNode prev = head;
		
		for(int i=1;i<s;i++) {
			int sec;
			sec = Sc.nextInt();
			
			DNode temp = new DNode(sec,null,prev);
			
			prev.next = temp;
			prev = temp;
		}
		
		return head;
	}
	
	static DNode DeletionbyValueDLL(DNode head) {
		Scanner Sc = new Scanner(System.in);

		if(head == null || head.next == null) {
			System.out.print("DLL is Empty!");
			return null;
		}
		
		int val;
		System.out.print("Enter node value to delete = ");
		val = Sc.nextInt();
		
		DNode temp = head;
		
		while(temp.data!=val) {
			temp = temp.next;
		}
		
		if(temp.back == null) {
			head = head.next;
			head.back = null;
			
			temp.next=null;
			return head;
		}
		
		if(temp.next == null) {
			head.next = null;
			
			temp.back = null;
			return head;
		}
		
		temp.back.next = temp.next;
		temp.next.back = temp.back;
		
		temp.next = null;
		temp.back = null;
		
		return head;
	}
	
	static void PrintDLL(DNode Newhead) {
		
		DNode temp1 = Newhead;
		
		while(temp1!=null) {
			System.out.print(temp1.data+" ");
			temp1 = temp1.next;
		}
	}
	
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int s;
		System.out.print("Enter Size of DLL = ");
		s = Sc.nextInt();
		
		DNode head = CreationDLL(s);
		
		DNode head1 = DeletionbyValueDLL(head);
		
		PrintDLL(head1);
	}

}
