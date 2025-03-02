package DSA.Step7StackandQueues;
import java.util.List;
import java.util.ArrayList;

public class SlidingWindowMaximumBrute {
	static List<Integer> FindMaximum(int[] arr,int k){
		List<Integer> list = new ArrayList<>();
		int n = arr.length;
			
		for(int i=0;i<=n-k;i++) {
			int max = Integer.MIN_VALUE;
			for(int j=i;j<i+k;j++) {
				max = Math.max(max, arr[j]);
			}
			list.add(max);
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
