package DSA.Step7StackandQueues;
import java.util.Stack;

public class PreviousSmallerElementStackOptimal {
	static int[] FindPSE(int[] arr) {
		// Using Monotonic Stack (Storing elements in stack in specified order)
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] PSEarr = new int[n];
		
		for(int i=0;i<n;i++) {
			while(!st.isEmpty() && arr[i]<=st.peek()) st.pop();
			
			if(st.isEmpty()) PSEarr[i] = -1;
			
			else PSEarr[i] = st.peek();
			
			st.push(arr[i]);
		}
		
		return PSEarr;
	}
	public static void main(String args[]) {
		int[] arr = {4, 5, 2, 10, 8};
		int[] PSEarr = FindPSE(arr);
		
		for(int i=0;i<PSEarr.length;i++) {
			System.out.print(PSEarr[i]+" ");
		}
	}
}
