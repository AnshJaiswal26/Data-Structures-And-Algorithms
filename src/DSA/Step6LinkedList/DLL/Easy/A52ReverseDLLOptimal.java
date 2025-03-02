package DSA.Step6LinkedList.DLL.Easy;
import java.util.Scanner;

public class A52ReverseDLLOptimal {
	static DNode CreationDLL(int s) {
		Scanner Sc = new Scanner(System.in);
		
		if(s==0) {
			System.out.print("DLL is Empty!");
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
	
	static DNode ReverseDLL(DNode head) {
		if(head==null || head.next==null) {
			return head;
		}
		
		DNode curr = head;
		DNode last=null;
		
		while(curr!=null){
			//last = curr.back;
			curr.back = curr.next;
			curr.next = last;
			
			last = curr;
			curr = curr.back;
		}
		// return last.back;
		return last;
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
		
		DNode head1 = ReverseDLL(head);
		
		PrintDLL(head1);
	}

}
