package DSA.Step4BinarySearch.Hard;

import java.util.Arrays;

public class B31MedianRowWiseSortedMatrixBrute {
	public static void main(String args[]) {
		int[][] arr = {{1, 5, 7, 9, 11},{2, 3, 4, 5, 10},{9, 10, 12, 14, 16}};
		int r = arr.length;
		int c = arr[0].length;
		// 1 2 3 4 5 5 7 9 9 10 10 11 12 14 16
		int [] arr1 = new int[r*c];	
		
		int ind = 0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr1[ind]= arr[i][j];
				ind++;
			}
		}
		
		Arrays.sort(arr1);
		
		int mid = (0+(arr1.length-1))/2;
		
		System.out.print(arr1[mid]);
	}

}
