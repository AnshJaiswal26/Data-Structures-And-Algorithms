package DSA.Step6LinkedList.DLL.Easy;
import java.util.Scanner;

public class A22InsertionAtLastDLL {
	static DNode CreationDLL(int s) {
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
	
	static DNode InsertatLastDLL(DNode head) {
		Scanner Sc = new Scanner(System.in);
		
		if(head==null) {
			System.out.print("DLL is Empty!");
			return head;
		}
		
		int ele;
		System.out.print("Enter ele to insert at first = ");
		ele = Sc.nextInt();
		
		DNode tail = head;
		
		while(tail.next!=null) {
			tail = tail.next;
		}
		
		DNode forw = new DNode(ele,null,tail);
		
		tail.next = forw;
		
		return head;
	}
	
	static void PrintDLL(DNode head) {
		DNode temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int s;
		System.out.print("Enter size of DLL = ");
		s = Sc.nextInt();
		
		DNode head = CreationDLL(s);
		
		DNode head1 = InsertatLastDLL(head);
		
		PrintDLL(head1);
	}

}
