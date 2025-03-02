package DSA.Step6LinkedList.DLL.Easy;

public class DNode{
	int data;
	DNode next;
	DNode back;
	
	DNode(int data,DNode next, DNode back){
		this.data = data;
		this.next = next;
		this.back = back;
	}
	
	DNode(int data){
		this.data =  data;
		this.next = null;
		this.back = null;
	}
}
