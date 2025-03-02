package DSA.Step6LinkedList.DLL.Easy;
import java.util.Scanner;

public class A42DeletionAtLastDLL {
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
	
	static DNode DeletionatLastDLL(DNode head) {
		
		if(head==null || head.next==null) {
			System.out.print("DLL is Empty!");
			return null;
		}
		
		DNode temp = head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.back.next = null;
		temp.back=null;
		
		return head;
	}
	
	static void PrintDLL(DNode Newhead) {
		
		DNode temp = Newhead;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int s;
		System.out.print("Enter Size of DLL = ");
		s = Sc.nextInt();
		
		DNode head = CreationDLL(s);
		
		DNode head1 = DeletionatLastDLL(head);
		
		PrintDLL(head1);
	}

}
