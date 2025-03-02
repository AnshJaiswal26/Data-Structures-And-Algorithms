package DSA.Step7StackandQueues;
import java.util.Stack;

public class SumOfSubarrRangesOptimal {
	
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
			int psee = i-PSEE[i];
			int nse = NSE[i]-i;
			
			total = (total + (psee*nse*arr[i])%mod)%mod;
		}
		
		return total;
	}
	
	static int[] FindNGE(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] NGEind = new int[n];
		
		for(int i=n-1;i>=0;i--) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) st.pop();
			if(st.isEmpty()) NGEind[i] = n;
			else NGEind[i] = st.peek();
			
			st.push(i);
		}
		return NGEind;
	}
	
	static int[] FindPGEE(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] PGEEind  = new int[n];
		
		for(int i=0;i<n;i++) {
			
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) st.pop();
			if(st.isEmpty()) PGEEind[i] = -1;
			else PGEEind[i] = st.peek();
			
			st.push(i);
		}
		return PGEEind;
	}
	
	static int FindMaximums(int[] arr) {
		int[] NGE = FindNGE(arr);
		int[] PGEE = FindPGEE(arr);
		int n = arr.length;
		int total = 0,mod = (int)(1e9+7);
		
		for(int i=0;i<n;i++) {
			int pgee = i-PGEE[i];
			int nge = NGE[i]-i;
			
			total = (total + (pgee*nge*arr[i])%mod)%mod;
		}
		
		return total;
	}
	
	static int FindSum(int[] arr) {
		int Mini = FindMinimums(arr);
		int Maxi = FindMaximums(arr);
		
		return Maxi-Mini;
	}
	
	public static void main(String args[]) {
		int[] arr = {3, 1, 2, 4};
		int ans = FindSum(arr);
		System.out.print(ans);
	}
}
