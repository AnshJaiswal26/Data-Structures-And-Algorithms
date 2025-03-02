package DSA.Step4BinarySearch.Hard;

public class B32MedianRowWiseSortedMatrixOptimal {
	static int  MAX(int[][] arr,int r,int c) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<r;i++) {
			if(arr[i][c-1]>max) {
				max=arr[i][c-1];
			}
		}
		return max;
	}
	static int  MIN(int[][] arr,int r,int c) {
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<r;i++) {
			if(arr[i][0]<min) {
				min=arr[i][0];
			}
		}
		return min;
	}
	static int UBBS(int [] arr,int c,int x) {
		int s=0,e=c-1;
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(arr[mid]<=x) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}		
		}
		return s;
	}
	static int CalculateEle(int[][] arr,int r,int c,int mid) {
		int cnt = 0;
		for(int i=0;i<r;i++) {
			cnt+=UBBS(arr[i],c,mid);
		}
		return cnt;
	}
	static int BS(int[][] arr,int r,int c) {
		
		int s = MIN(arr,r,c);
		int e = MAX(arr,r,c);
		int req = (r*c)/2;
		
		while(s<=e) {
			int mid = (s+e)/2;
			
			int smalleq = CalculateEle(arr,r,c,mid);
			
			if(smalleq<=req) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
		return s;
	}
	public static void main(String args[]) {
		
		int [][] arr = {{1, 5, 7, 9, 11},{2, 3, 4, 5, 10},{9, 10, 12, 14, 16}};
		int r = arr.length;
		int c = arr[0].length;
		
		int ans = BS(arr,r,c);
		
		System.out.print("median = "+ans);
	}

}
