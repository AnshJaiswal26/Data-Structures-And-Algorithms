package DSA.Step6LinkedList.DLL.Medium;
import java.util.Scanner;
public class A3RemoveDuplicatesFromSortedDLL {
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
	
	static DNode DeletionOfDuplicatesDLL(DNode head) {
		if(head == null || head.next == null) return head;
		
		DNode temp = head;
		DNode Nextnode;
		
		while(temp!=null && temp.next!=null) {
			Nextnode = temp.next;
			
			while(Nextnode!=null && Nextnode.data == temp.data) {
				Nextnode = Nextnode.next;
			}
			
			temp.next = Nextnode;
			if(Nextnode!=null) Nextnode.back = temp;
			temp = temp.next;	
		}
		
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
		
		DNode head1 = DeletionOfDuplicatesDLL(head);
		
		PrintDLL(head1);
	}

}

