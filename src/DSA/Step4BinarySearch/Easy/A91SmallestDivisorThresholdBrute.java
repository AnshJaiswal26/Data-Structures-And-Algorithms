package DSA.Step4BinarySearch.Easy;

public class A91SmallestDivisorThresholdBrute {
	static int max(int[] arr,int s) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s;i++){
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	static double divisor(int[] arr,int s,int i) {
		double div=0;
		for(int j=0;j<s;j++) {
			div= div + Math.ceil( (double)arr[j]/(double)i);
		}
		return div;
	}
	static int SmallestDivisor(int[] arr,int s,int threshold) {
		for(int i=1;i<max(arr,s);i++) {
			if(divisor(arr,s,i)<=threshold) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int[] arr = {1, 2, 5, 9};
		int threshold = 6;
		int s = arr.length;
		
		int ans = SmallestDivisor(arr,s,threshold);
		
		System.out.print(ans);
	}

}
