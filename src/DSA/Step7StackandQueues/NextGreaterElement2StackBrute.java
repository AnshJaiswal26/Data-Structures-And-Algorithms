package DSA.Step7StackandQueues;

public class NextGreaterElement2StackBrute {
	static int[] FindNGE2(int[] arr) {
		int n = arr.length;
		int[] NGEarr = new int[n];
		
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n+i;j++) {
				int ind = j%n;
				
				if(arr[ind]>arr[i]) {
					NGEarr[i] = arr[ind];
					break;
				}
				else {
					NGEarr[i] = -1;
				}
			}		
		}
		return NGEarr;
	}
	
	public static void main(String args[]) {
		int[] arr = {2, 10, 12, 1, 11};      
		int[] NGEarr = FindNGE2(arr);
		
		for(int i=0;i<NGEarr.length;i++) {
			System.out.print(NGEarr[i]+" ");
		}
	}
}
