package DSA.Step6LinkedList.DLL.Medium;
import java.util.Scanner;
import java.util.*;

public class A21FindAllPairsOfGivenSumDLLBrute{
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
	
	static List<List<Integer>> FindPairsEqKeyDLL(DNode head,int key) {
		List<List<Integer>> ans = new ArrayList<>();
		
		DNode temp1 = head;
		DNode temp2;
		
		while(temp1!=null) {
			
			temp2 = temp1.next;
			
			while(temp2!=null && temp2.data<=key) {
				if(temp1.data+temp2.data == key) {
					List<Integer> list = Arrays.asList(temp1.data,temp2.data);
					ans.add(list);
				}
				temp2 = temp2.next;
			}	
			temp1 = temp1.next;
		}
		
		return ans;
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
		
		int sum;
		System.out.print("Enter Key = ");
		sum = Sc.nextInt();
		
		List<List<Integer>> ans = FindPairsEqKeyDLL(head,sum);
		
		//PrintDLL(head1);
		for(List<Integer> row : ans) {
			for(int ele : row) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		
	}

}


