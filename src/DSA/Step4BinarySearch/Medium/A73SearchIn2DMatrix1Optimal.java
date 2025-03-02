package DSA.Step4BinarySearch.Medium;

public class A73SearchIn2DMatrix1Optimal {
	static void BS(int[][] arr,int r,int c,int target) {
		int rows = 0;
		int col = c-1;
		
		while(rows<r && col>=0) {
			if(arr[rows][col]==target) {
				System.out.print("rows = "+rows+" & colums = "+col);
				break;
			}
			else if(arr[rows][col]>target) {
				col=col-1;
			}
			else {
				rows=rows+1;
			}
		}
	}
	public static void main(String args[]) {
		int[][] arr = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
		int r = arr.length;
		int c = arr[0].length;
		int target = 14;
		
		BS(arr,r,c,target);
	}

}
