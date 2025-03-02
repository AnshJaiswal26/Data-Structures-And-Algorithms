package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class B33FindIntersectionOfYSLLOptimal{
	static Node Create(int s) {
        Scanner Sc = new Scanner(System.in);

        if(s==0) {
			return null;
		}
        
		int first;
		System.out.println("Enter ele of SLL = ");
		first = Sc.nextInt();
		
		Node head = new Node(first,null);
		Node mover = head;
		
		for(int i=1;i<s;i++) {
			int sec;
			sec = Sc.nextInt();
			
			Node temp = new Node(sec,null);
			
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	static Node CreationIntersectionAndFindSLL(int s1,int s2) {
        Scanner Sc = new Scanner(System.in);

        Node head1 = Create(s1);
        Node head2 = Create(s2);
        
        Node temp = head1;
        
        while(temp.next!=null) {
        	temp = temp.next;
        }
        
        int O;
        System.out.print("Press 1 to create intersection or 0 to create linear SLL = ");
        O =Sc.nextInt();
        
       
        if(O==1) {
        	 int Cnt;
        	System.out.print("Enter Node Position of 2nd SLL from where you want to create Intersection = ");
        	Cnt = Sc.nextInt();
        	
        	 Node temp2 = head2;
             while(Cnt>1) {
             	temp2 = temp2.next;
             	Cnt--;
             }
             temp.next = temp2;
        }
       
        
        PrintSLL(head1);
        System.out.println("");
        PrintSLL(head2);
        System.out.println("");
        
        return FindIntersectionNode(head1,head2);
	}
	
	static void PrintSLL(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	static Node FindIntersectionNode(Node head1, Node head2) {
		if(head1 == null || head2 == null) return null;
		
		Node temp1 = head1;
		Node temp2 = head2;
		
		while(temp1 != temp2) {
			
			temp1 = temp1.next;
			temp2 = temp2.next;
			
			if(temp1 == temp2) return temp1;
			if(temp1 == null) temp1 = head2;
			if(temp2 == null) temp2 = head1;
			
		}
		
		return temp1;
	}
       	
	public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
		
		int s1;
		System.out.print("Enter size of 1st SLL = ");
		s1 = Sc.nextInt();
		
		int s2;
		System.out.print("Enter size of 2nd SLL = ");
		s2 = Sc.nextInt();
		
		Node ans = CreationIntersectionAndFindSLL(s1,s2);
		if(ans!=null) {
			System.out.println("intersection node = "+ans.data);
		}
		else {
			System.out.println("No Intersection");
		}	
	}
}

