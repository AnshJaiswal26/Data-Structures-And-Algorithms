package DSA.Step7StackandQueues;

public class PreviousSmallerElementStackBrute {
	static int[] FindPSE(int[] arr) {
		int n = arr.length;
		int[] PSEarr = new int[n];
		
		for(int i=n-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				
				if(arr[j]<arr[i]) {
					PSEarr[i] = arr[j];
					break;
				}
				else {
					PSEarr[i] = -1;
				}
			}
			if(i==0) PSEarr[i] = -1;
		}
		
		return PSEarr;
	}
	
	public static void main(String args[]) {
		int[] arr = {4, 5, 2, 10, 8};
		int[] PSEarr = FindPSE(arr);
		
		for(int i=0;i<PSEarr.length;i++) {
			System.out.print(PSEarr[i]+" ");
		}
	}
}
