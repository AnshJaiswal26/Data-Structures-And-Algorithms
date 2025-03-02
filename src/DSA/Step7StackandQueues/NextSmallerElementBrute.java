package DSA.Step7StackandQueues;

public class NextSmallerElementBrute {
	static int[] FindNSE(int[] arr) {
		int n = arr.length;
		int[] NSEarr = new int[n];
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
				if(arr[j]<arr[i]) {
					NSEarr[i] = arr[j];
					break;
				}
				else {
					NSEarr[i] = -1;
				}
			}
			if(i==n-1) NSEarr[i] = -1;
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
