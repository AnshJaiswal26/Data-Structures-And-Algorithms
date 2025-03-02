package DSA.Step4BinarySearch.Hard;

public class B21FindPeakElein2DArrBrute {
	static void Index(int[][] arr,int r,int c) {
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==0) {
					if(j==0) {
						if(arr[i][j]>arr[i][j+1] && arr[i][j]>arr[i+1][j]) {
							System.out.print("rows = "+i+" & colums = "+j);
							return;
						}
					}
					else if(j==c-1) {
						if(arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i+1][j]) {
							System.out.print("rows = "+i+" & colums = "+j);
							return;
						}
					}
					else {
						if(arr[i][j]>arr[i][j+1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j-1]) {
							System.out.print("rows = "+i+" & colums = "+j);
							return;
						}
					}
				}
				else if(i==r-1) {
					if(j==0) {
						if(arr[i][j]>arr[i][j+1] && arr[i][j]>arr[i-1][j]) {
							System.out.print("rows = "+i+" & colums = "+j);
							return;
						}
					}
					else if(j==c-1) {
						if(arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i-1][j]) {
							System.out.print("rows = "+i+" & colums = "+j);
							return;
						}
					}
					else {
						if(arr[i][j]>arr[i][j+1] && arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1]) {
							System.out.print("rows = "+i+" & colums = "+j);
							return;
						}
					}
				}
				else if(j==0) {
					if(arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j+1]) {
						System.out.print("rows = "+i+" & colums = "+j);
						return;
					}
				}
				else if(j==c-1){
					if(arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1]) {
						System.out.print("rows = "+i+" & colums = "+j);
						return;
					}			
				}
				else {
					if(arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i][j+1]) {
						System.out.print("rows = "+i+" & colums = "+j);
						return;
					}
				}
			}
		}
	}
	public static void main(String args[]) {
		int[][] arr= {{1, 2, 1, 1, 1, 1},{2, 9, 3, 2, 3, 2},{1, 7, 6, 0, 1, 3},{3, 6, 2, 3, 7, 2}};
		int r = arr.length;
		int c = arr[0].length;
		
		Index(arr,r,c);
	}

}
// 1 2 1 1 1 1 
// 2 9 3 2 3 2
// 1 7 6 0 1 3
// 3 6 2 3 7 2