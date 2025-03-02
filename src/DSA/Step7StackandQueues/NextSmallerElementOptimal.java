package DSA.Step7StackandQueues;
import java.util.Stack;

public class NextSmallerElementOptimal {
	static int[] FindNSE(int[] arr) {
		// Using Monotonic Stack (Storing elements in stack in specified order)
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] NSEarr = new int[n];
		
		for(int i=n-1;i>=0;i--) {
			
			while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
			
			if(st.isEmpty()) NSEarr[i] = -1;
			
			else NSEarr[i] = st.peek();
			
			st.push(arr[i]);
		}
		return NSEarr;
	}
	
	public static void main(String args[]) {
		int[] arr = {4, 5, 2, 10, 8};// 2  2  -1  8  -1
		
		int[] NSEarr = FindNSE(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(NSEarr[i]+" ");
		}
	}
}
