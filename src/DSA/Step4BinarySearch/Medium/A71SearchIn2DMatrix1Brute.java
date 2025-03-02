package DSA.Step4BinarySearch.Medium;

public class A71SearchIn2DMatrix1Brute {
	public static void main(String args[]) {
		int[][] arr = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
		int r = arr.length;
		int c = arr[0].length;
		int target = 14;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(target == arr[i][j]) {
					System.out.print("row = "+i+" & column = "+j);
					break;
				}
			}
		}
	}

}
