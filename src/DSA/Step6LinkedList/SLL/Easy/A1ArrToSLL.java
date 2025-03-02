package DSA.Step6LinkedList.SLL.Easy;

public class A1ArrToSLL {
	
	static Node arrtoLL(int[] arr) {
		
		Node head = new Node(arr[0],null);
		Node mover = head;
		
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i],null);
			mover.next = temp;
			mover=temp;
		}
		return head;
	}
	static int lengthofll(Node temp) {
		int cnt = 0;
		
		while(temp!=null) {
			cnt++;
			temp = temp.next;
		}
		
		return cnt;
	}
	public static void main(String args[]) {
		int[] arr = {2, 5, 6, 8};
		Node head = arrtoLL(arr);
		//System.out.print(head.data);
		
		Node temp = head;
		System.out.print(lengthofll(temp));
		
//		while(temp!=null) {
//			System.out.print(temp.data+" ");
//			temp = temp.next;
//		}
	}

}
