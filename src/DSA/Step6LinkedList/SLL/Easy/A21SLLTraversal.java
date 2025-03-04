package DSA.Step6LinkedList.SLL.Easy;

public class A21SLLTraversal {
	
	private static Node arrtoLL(int[] arr) {
		
		Node head = new Node(arr[0],null);
		Node mover = head;
		
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i],null);
			mover.next = temp;
			mover=temp;
		}
		return head;
	}

	public static void main(String args[]) {
		int[] arr = {2, 5, 6, 8};
		Node head = arrtoLL(arr);
		//System.out.print(head.data);
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

}
