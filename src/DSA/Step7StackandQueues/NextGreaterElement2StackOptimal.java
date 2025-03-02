package DSA.Step7StackandQueues;
import java.util.Stack;

public class NextGreaterElement2StackOptimal {
	static int[] FindNGE2(int[] arr) {
		// Using Monotonic Stack (Storing elements in stack in specified order)
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] NGEarr = new int[n];
		
		
		for(int i=(2*n)-1;i>=0;i--) {
			int ind = i%n;
			
			while(!st.isEmpty() && arr[ind]>=st.peek()) st.pop();
			
			if(i<n) {
				if(st.isEmpty()) NGEarr[i] = -1;
				else NGEarr[i] = st.peek();
			}
			
			st.push(arr[ind]);
		}
		return NGEarr;
	}
	
	public static void main(String args[]) {
		int[] arr = {2, 10, 12, 1, 11};// 2 10 12 1 11      
		int[] NGEarr = FindNGE2(arr);
		
		for(int i=0;i<NGEarr.length;i++) {
			System.out.print(NGEarr[i]+" ");
		}
	}
}
