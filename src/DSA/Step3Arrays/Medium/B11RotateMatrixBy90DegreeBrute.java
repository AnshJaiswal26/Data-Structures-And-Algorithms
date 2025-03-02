package DSA.Step3Arrays.Medium;
import java.util.*;
public class B11RotateMatrixBy90DegreeBrute {
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(2,3,1,7)));
		matrix.add(new ArrayList<>(Arrays.asList(5,1,0,8)));
		matrix.add(new ArrayList<>(Arrays.asList(9,3,1,2)));
		matrix.add(new ArrayList<>(Arrays.asList(7,1,2,0)));
		
		int n = matrix.size();
		int m = matrix.get(0).size();
		
		int [][] arr = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[j][n-i-1]=matrix.get(i).get(j);
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
