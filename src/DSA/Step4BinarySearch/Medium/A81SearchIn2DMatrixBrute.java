package DSA.Step4BinarySearch.Medium;

public class A81SearchIn2DMatrixBrute {
	public static void main(String args[]) {
		int[][] arr = {{3, 4, 7, 9},{12, 13, 16, 18},{20, 21, 23, 29}};
		int c = arr[0].length;
		int r = arr.length;
		
		int tg = 23;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(tg==arr[i][j]) {
					System.out.print("row = "+(i+1)+" & column = "+(j+1));
				}
			}
		}
	}

}
