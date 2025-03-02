package DSA.Step6LinkedList.DLL.Easy;
import java.util.Scanner;

public class A23InsertionAtPosDLL {
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
	
	static DNode InsertatPosDLL(DNode head,int s) {
		Scanner Sc = new Scanner(System.in);
		
		if(head==null) {
			System.out.print("DLL is Empty!");
			return head;
		}
		
		int ele;
		System.out.print("Enter ele to insert at pos = ");
		ele = Sc.nextInt();
		
		int pos;
		System.out.print("Enter pos to insert = ");
		pos = Sc.nextInt();
		
		if(pos>s) {
			System.out.print("wrong Position!");
			return null;
		}
		
		DNode temp = head;
		
		int cnt=0;
		while(cnt<pos-2) {
			temp = temp.next;
			cnt++;
		}
		
		if(temp.next==null && pos>1) {
			DNode forw = new DNode(ele,null,temp);
			temp.next = forw; 
			return head;
		}
		
		else if(temp.back == null && pos==1) {
			DNode prev = new DNode(ele,head,null);
			head.back = prev;
			head = prev;
			return head;
		}
		
		DNode prev = new DNode(ele,temp.next,temp);
		
		temp.next.back = prev;
		temp.next = prev;
		
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
		
		DNode head1 = InsertatPosDLL(head,s);
		
		PrintDLL(head1);
	}

}
