package DSA.Step4BinarySearch.Hard;

public class B22FindPeakElein2DArrOptimal {
	static int MAX(int[][] arr,int mid ,int r,int c) {
		int max = Integer.MIN_VALUE;
		int index=-1;
		
		for(int i=0;i<r;i++) {
			if(arr[i][mid]>max) {
				max=arr[i][mid];
				index = i;
			}
		}
		return index;
	}
	static void BS(int[][] arr,int r,int c) {
		int s=0,e=c-1;
		
		while(s<=e) {
			int mid = (s+e)/2;
			int row = MAX(arr,mid,r,c);
			
			int left,right;
			
			if(mid>0) {
			left = arr[row][mid-1];
			}
			else left=-1;
			
			if(mid<c-1) {
			right = arr[row][mid+1];
			}
			else right=-1;
			
			if(arr[row][mid]>left && arr[row][mid]>right) {
				System.out.print("row = "+row+" & column = "+mid);
				return;
			}
			else if(left>arr[row][mid]) {
				e=mid-1;
			}
			else{
				s=mid+1;
			}
		}
	}
	public static void main(String args[]) {
		int[][] arr= {{1, 2, 1, 5, 1, 1},{2, 1, 3, 2, 3, 2},{1, 7, 6, 0, 1, 3},{3, 6, 2, 3, 7, 2}};
		int r = arr.length;
		int c = arr[0].length;
		
		BS(arr,r,c);
	}

}
