package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;

public class A23ReverseSLLOptimalRecursive {

	static Node CreationLL(int s) {
		Scanner Sc = new Scanner(System.in);

		int first;
		System.out.println("Enter ele of LL = ");
		first = Sc.nextInt();

		Node head = new Node(first, null);
		Node mover = head;

		for (int i = 1; i < s; i++) {
			int ele;
			ele = Sc.nextInt();

			Node temp = new Node(ele, null);

			mover.next = temp;
			mover = temp;
		}
		return head;
	}

	static Node ReverseLL(Node head) {
		if (head == null || head.next == null) return head;

		Node Newhead = ReverseLL(head.next);

		Node front = head.next;
		head.next = null;
		front.next = head;
		//   5->4->3->2->1->null
		//   h__f
		//   ^  |
		//   |__v
		// 1=N  h__f
		//      ^  |
		//      |__v
		//    1=N  h__f  
		//         ^  |
		//         |__v
		//       1=N  h__f
		//            ^  |
		//            |__v
		//          1=N  h->null
		//   4  3  2  1  N

		// null<-5<-4<-3<-2<-1

		return Newhead;
	}

	static void PrintLL(Node head) {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);

		int s;
		System.out.print("Enter size LL = ");
		s = Sc.nextInt();

		Node head = CreationLL(s);

		Node head1 = ReverseLL(head);

		PrintLL(head1);
	}

}
