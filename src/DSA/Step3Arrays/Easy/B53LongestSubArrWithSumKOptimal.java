package DSA.Step3Arrays.Easy;

public class B53LongestSubArrWithSumKOptimal {
	public static void main(String args[]) {
		int[] arr = {-1,-1,2,3,3,2,6};
		int k=3;
		int maxlen = 0,right=0,left=0;
		int s = arr.length,sum=arr[0];
		
		while(right<s) {
			while(right>=left && sum>k) {
				sum = sum - arr[left];
				left++;
			}
			if(sum == k) {
				maxlen = Math.max(maxlen, right-left+1);
			}
			right++;
			if(right<s) {
			sum = sum + arr[right];
			}		
		}
		System.out.print("Longest subarray sum is "+maxlen);
	}

}
