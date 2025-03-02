package DSA.Step6LinkedList.DLL.Easy;

public class A1ArrtoDLL {
	static  DNode arrtoDLL(int[] arr) {
		
		DNode head = new DNode(arr[0],null,null);
		DNode prev = head;
		
		for(int i=1;i<arr.length;i++) {
			DNode temp = new DNode(arr[i],null,prev);
			
			prev.next = temp;
			prev = temp;
		}
		
		return head;
	}
	
	static void PrintDLL(DNode head) {
		DNode temp  = head;
		
		while(temp!= null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String args[]) {
		int[] arr = {1, 3, 2, 4};
		
		DNode head = arrtoDLL(arr);
		PrintDLL(head.back);
	}

}
