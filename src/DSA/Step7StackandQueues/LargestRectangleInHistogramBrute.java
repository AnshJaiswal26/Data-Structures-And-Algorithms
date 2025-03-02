package DSA.Step7StackandQueues;

public class LargestRectangleInHistogramBrute {
	
	static int FindArea(int[] arr) {
		int n = arr.length;
		int l,r;
		int maxarea = -1;
		
		for(int i=0;i<n;i++) {
			l=r=i;
			
			while(l>=0 && arr[i]<=arr[l]) l--;
			while(r<n && arr[i]<=arr[r]) r++;
			
			int area = ((i-l)+(r-i)-1)*arr[i];
			
			maxarea = Math.max(maxarea, area);
		}
		
		return maxarea;
	}
	public static void main(String args[]) {
		int [] arr = {2, 1, 5, 6, 2, 3};
		int ans = FindArea(arr);
		System.out.print(ans);
	}
}
