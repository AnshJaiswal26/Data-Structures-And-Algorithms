package DSA.Step4BinarySearch.Easy;

public class B21RowWithMaxNumOf1sIn2DArrBrute {
	static int CntMax1s(int[][] arr,int r,int c) {
		int cnt1srow = -1,ind = -1;
		for(int i=0;i<r;i++) {
			int sum=0;
			for(int j=0;j<c;j++) {
				sum+=arr[i][j];
			}
			if(sum>cnt1srow) {
				cnt1srow=sum;
				ind = i+1;
			}
		}
		return ind;
	}
	public static void main(String args[]) {
		int r=5,c=5;
		int[][] arr = {{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,1}};
		
		int ans = CntMax1s(arr,c,r);
		
		System.out.print(ans);
	}

}
