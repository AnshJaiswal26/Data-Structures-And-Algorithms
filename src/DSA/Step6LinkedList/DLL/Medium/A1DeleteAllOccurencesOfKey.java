package DSA.Step6LinkedList.DLL.Medium;
import java.util.Scanner;

public class A1DeleteAllOccurencesOfKey{
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
	
	static DNode DeletionOfKeyDLL(DNode head,int key) {
		if(head == null) return head;
		
		DNode temp = head;
		DNode prev;
		DNode Nextnode;
		
		while(temp!=null) {
			if(temp.data == key) {
				if(temp == head) {
					head = head.next;
				}
				Nextnode = temp.next;
				prev = temp.back;
				
				if(prev!=null) prev.next = Nextnode;
				if(Nextnode!=null) Nextnode.back = prev;
				temp = Nextnode;
			}
			else {
				temp = temp.next;
			}
			
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
		
		int key;
		System.out.print("Enter Key = ");
		key = Sc.nextInt();
		
		DNode head1 = DeletionOfKeyDLL(head,key);
		
		PrintDLL(head1);
	}

}

