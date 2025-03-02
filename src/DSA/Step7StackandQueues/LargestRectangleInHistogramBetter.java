package DSA.Step7StackandQueues;

import java.util.Stack;

public class LargestRectangleInHistogramBetter {
	static int[] FindPSE(int[] arr) {
		// Using Monotonic Stack (Storing elements in stack in specified order)
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] PSEarr = new int[n];
		
		for(int i=0;i<n;i++) {
			
			while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
			
			if(st.isEmpty()) PSEarr[i] = -1;
			
			else PSEarr[i] = st.peek();
			
			st.push(i);
		}
		
		return PSEarr;
	}
	
	static int[] FindNSE(int[] arr) {
		// Using Monotonic Stack (Storing elements in stack in specified order)
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] NSEarr = new int[n];
		
		for(int i=n-1;i>=0;i--) {
			
			while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
			
			if(st.isEmpty()) NSEarr[i] = n;
			
			else NSEarr[i] = st.peek();
			
			st.push(i);
		}
		return NSEarr;
	}
	
	static int FindArea(int[] arr) {
		
		int n = arr.length;
		int[] nse = FindNSE(arr);
		int[] pse = FindPSE(arr);
		int maxa = -1;
		
		for(int i=0;i<n;i++) {
			int area = (nse[i]-pse[i]-1)*arr[i];
			maxa = Math.max(maxa,area);
		}
		
		return maxa;
	}
	public static void main(String args[]) {
		int [] arr = {2, 1, 5, 6, 2, 3};
		int ans = FindArea(arr);
		System.out.print(ans);
	}
}
