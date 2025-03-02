package DSA.Step7StackandQueues;

public class SumOfSubarrRangesBrute {
	static int FindSum(int[] arr) {
		int n = arr.length;
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			
			int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
			
			for(int j=i;j<n;j++) {
				
				 min = Math.min(min,arr[j]);
				 max = Math.max(max,arr[j]);
				
				sum+= max - min;
			}
		}
		return sum;
	}
	public static void main(String args[]) {
		int[] arr = {1, 4, 3, 2};
		
		int ans = FindSum(arr);
		System.out.print(ans);
	}
}
