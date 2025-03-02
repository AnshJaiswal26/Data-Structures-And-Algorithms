package DSA.Step4BinarySearch.Easy;

public class A92SmallestDivisorThresholdOptimal {
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
		int ans=0;
		int st=1,e=max(arr,s);
		
		while(st<=e) {
			int mid = (st+e)/2;
			
			if(divisor(arr,s,mid)<=threshold) {
				ans=mid;
				e=mid-1;
			}
			else {
				st=mid+1;
			}
		}
		
		return st;
	}
	public static void main(String args[]) {
		int[] arr = {1, 2, 5, 9};
		int threshold = 6;
		int s = arr.length;
		
		int ans = SmallestDivisor(arr,s,threshold);
		
		System.out.print(ans);
	}

}
