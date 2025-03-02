package DSA.Step6LinkedList.SLL.Easy;

public class A5SearchEleInSLL {
	
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
	static boolean Search(Node temp,int a) {

		
		while(temp!=null) {
			if(temp.data == a) return true;
			temp = temp.next;
		}
		
		return false;
	}
	public static void main(String args[]) {
		int[] arr = {2, 5, 6, 8};
		Node head = arrtoLL(arr);
		
		Node temp = head;
		System.out.print(Search(temp,9));
		
	}

}
