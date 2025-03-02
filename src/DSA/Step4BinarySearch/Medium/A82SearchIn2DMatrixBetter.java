package DSA.Step4BinarySearch.Medium;

public class A82SearchIn2DMatrixBetter{
	static int BS(int[] arr,int c,int tg) {
		int s=0,e=c-1;
		
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(arr[mid]==tg) {
				return mid+1;
			}
			else if(arr[mid]>tg) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int[][] arr = {{3, 4, 7, 9},{12, 13, 16, 18},{20, 21, 23, 29}};
		int c = arr[0].length;
		int r = arr.length;
		
		int tg = 20;
		
		
		for(int i=0;i<r;i++) {
			if(arr[i][0]<=tg && tg<=arr[i][c-1]) {
				int  ans = BS(arr[i],c,tg);
				 System.out.print("row = "+(i+1)+" & column = "+(ans));
			}
		}
		
		
	}

}
