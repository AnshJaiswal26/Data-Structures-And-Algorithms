package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class B32FindIntersectionOfYSLLBetter{
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
	static Node collision(Node t1, Node t2, int d) {
		while(d>0) {
			t1 = t1.next;
			d--;
		}

		while(t1!=t2) {
			t1 = t1.next;
			t2 = t2.next;
		}
		
		return t1;
	}
	
	static Node FindIntersectionNode(Node head1, Node head2) {
		Node temp = head1;
		
		int Cnt1=0;
		while(temp!=null) {
			temp = temp.next;
			Cnt1++;
		}
		
		temp = head2;
		int Cnt2=0;
		while(temp!=null) {
			temp = temp.next;
			Cnt2++;
		}
		
		Node temp1 = head1;
		Node temp2 = head2;
		
		if(Cnt1>Cnt2) {
			return collision(temp1,temp2,Cnt1-Cnt2);
		}
		else {
			return collision(temp2,temp1,Cnt2-Cnt1);
		}
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

