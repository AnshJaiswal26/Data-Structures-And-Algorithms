package DSA.Step6LinkedList.SLL.Medium;
import java.util.Scanner;
import java.util.*;

public class B11SortASLLBrute{
	static Node CreationLL(int s) {
		Scanner Sc = new Scanner(System.in);
		
		if(s==0) return null;
		
		int first;
		System.out.println("Enter ele of LL = ");
		first = Sc.nextInt();
		
		Node head = new Node(first,null);
		Node mover = head;
		
		for(int i=1;i<s;i++) {
			int ele;
			ele = Sc.nextInt();
			
			Node temp = new Node(ele,null);
			
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	static void Merger(List<Integer> list,int s,int mid,int e) {
		int left = s;
		int right = mid+1;
		int[] temp = new int[e-s+1];
		int indx = 0;
		
		while(left<=mid && right<=e) {
			if(list.get(left)<=list.get(right)) {
				temp[indx] = list.get(left);
				left++;
				indx++;
			}
			else {
				temp[indx] = list.get(right);
				right++;
				indx++;
			}
		}	
		while(left<=mid) {
			temp[indx] = list.get(left);
			left++;
			indx++;
		}
		while(right<=e) {
			temp[indx] = list.get(right);
			right++;
			indx++;
		}
		
		for(int i=0,j=s;i<temp.length;i++,j++) {
			list.set(j,temp[i]);
		}
	}
	
	static void Divide(List<Integer> list,int s,int e){
		if(s>=e) return; 
		
		int mid = s+(e-s)/2; 
		
		Divide(list,s,mid);
		Divide(list,mid+1,e);
		Merger(list,s,mid,e);
		return;
	}
	
	static void MergeSort(List<Integer> list){
		 int s = 0,e = list.size()-1;
	     Divide(list,s,e); 
		 return;
	}
	
	static Node SortSLL(Node head) {
		
		List<Integer> list = new ArrayList<>();
		
		Node temp = head;
		int i=0;
		while(temp!=null) {
			list.add(i,temp.data);
			temp = temp.next;
			i++;
		}
		
		MergeSort(list);
		
		temp = head;
		i=0;
		while(temp!=null) {
			temp.data = list.get(i);
			i++;
			temp = temp.next;
		}
		
		return head;
	}
	
	static void PrintLL(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int s;
		System.out.print("Enter size LL = ");
		s=Sc.nextInt();
		
		Node head = CreationLL(s);
		
		Node head1 = SortSLL(head);
		
		PrintLL(head1);
	}

}
