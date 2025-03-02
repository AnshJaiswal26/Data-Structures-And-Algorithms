package DSA.Step7StackandQueues;

public class NextGreaterElementStackBrute {
	static int[] FindNGE(int[] arr) {

		int n = arr.length;
		int[] NGEarr = new int[n];
		
		for(int i=0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[j]>arr[i]) {
					NGEarr[i] = arr[j];
					break;
				}
				else {
					NGEarr[i] = -1;
				}
			}
			if(i==n-1) NGEarr[i]=-1;
		}
		return NGEarr;
	}
	
	public static void main(String args[]) {
		int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
		
		int[] NGEarr = FindNGE(arr);
		
		for(int i=0;i<NGEarr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nNext Greater Element of Every Element");
		for(int i=0;i<NGEarr.length;i++) {
			System.out.print(NGEarr[i]+" ");
		}
	}
}
