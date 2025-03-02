package DSA.Step7StackandQueues;
import java.util.Stack;

public class SumOfSubarrayMinimumOptimal {
	
	static int[] FindNSE(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] NSEind = new int[n];
		
		for(int i=n-1;i>=0;i--) {
			while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
			if(st.isEmpty()) NSEind[i] = n;
			else NSEind[i] = st.peek();
			
			st.push(i);
		}
		return NSEind;
	}
	
	static int[] FindPSEE(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] PSEEind  = new int[n];
		
		for(int i=0;i<n;i++) {
			
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) st.pop();
			if(st.isEmpty()) PSEEind[i] = -1;
			else PSEEind[i] = st.peek();
			
			st.push(i);
		}
		return PSEEind;
	}
	
	static int FindMinimums(int[] arr) {
		int[] NSE = FindNSE(arr);
		int[] PSEE = FindPSEE(arr);
		int n = arr.length;
		int total = 0,mod = (int)(1e9+7);
		
		for(int i=0;i<n;i++) {
			int pse = i-PSEE[i];
			int nse = NSE[i]-i;
			
			total = (total + (pse*nse*arr[i])%mod)%mod;
		}
		
		return total;
	}
	
	public static void main(String args[]) {
		int[] arr = {3, 1, 2, 4};
		
		int ans = FindMinimums(arr);
		
		System.out.print(ans);
	}
}
