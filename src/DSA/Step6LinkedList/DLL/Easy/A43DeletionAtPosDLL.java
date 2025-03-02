package DSA.Step6LinkedList.DLL.Easy;
import java.util.Scanner;

public class A43DeletionAtPosDLL {
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
	
	static DNode DeletionatPosDLL(DNode head,int s) {
		Scanner Sc = new Scanner(System.in);

		if(head == null || head.next == null) {
			System.out.print("DLL is Empty!");
			return null;
		}
		
		int pos;
		System.out.print("Enter pos to delete node = ");
		pos = Sc.nextInt();
		
		if(pos>s) {
			System.out.print("Wrong position!");
			return null;
		}
		
		DNode temp = head;
		
		int cnt=0;
		while(cnt<pos-1) {
			temp = temp.next;
			cnt++;
		}
		
		if(temp.back == null) {
			head = head.next;
			head.back = null;
			
			temp.next=null;
			return head;
		}
		
		else if(temp.next == null) {
			temp.back.next = null;
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
		
		DNode head1 = DeletionatPosDLL(head,s);
		
		PrintDLL(head1);
	}

}
