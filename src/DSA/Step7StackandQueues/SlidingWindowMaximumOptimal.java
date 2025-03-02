package DSA.Step7StackandQueues;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximumOptimal {
	static List<Integer> FindMaximum(int[] arr,int k){
		List<Integer> list = new ArrayList<>();
		Deque<Integer> q = new LinkedList<>();

		int n = arr.length;
		for(int i=0;i<n;i++) {
			
			if(!q.isEmpty() && q.peekFirst()<=i-k) q.pollFirst();
			
			while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]) q.pollLast();
			
			q.addLast(i);
			
			if(i>=k-1) list.add(arr[q.peekFirst()]);
		}
		
		return list;
	}
	public static void main(String args[]) {
		int k = 3;
		int[] arr = {1, 3, -1, -3, 5, 3, 2, 1, 6};
		
		List<Integer> ans = FindMaximum(arr,k);
		
		for(int it : ans) {
			System.out.print(it+" ");
		}	
	}
}
