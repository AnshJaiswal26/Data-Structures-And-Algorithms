package DSA.Step7StackandQueues;

public class SumOfSubarrayMinimumBrute {
	static int FindMins(int[] arr) {
		int sum = 0;
		int n = arr.length;
		int mod = (int)(1e9+7);
		
		for(int i=0;i<n;i++) {
			int mini = arr[i];
			
			for(int j=i;j<n;j++) {
				mini = Math.min(arr[j],mini);	
				sum=(sum+mini)%mod;
			}
		}
		return sum;
	}
	
	public static void main(String args[]) {
		int[] arr = {3, 1, 2, 4};
		int ans = FindMins(arr);
		System.out.print(ans);
	}
}
