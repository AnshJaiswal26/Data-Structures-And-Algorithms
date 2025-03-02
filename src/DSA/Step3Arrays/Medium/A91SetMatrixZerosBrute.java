package DSA.Step3Arrays.Medium;
import java.util.*;
public class A91SetMatrixZerosBrute {
	
	static void markRow(ArrayList<ArrayList<Integer>> matrix, int i,int m){
		for(int j=0;j<m;j++) {
			if(matrix.get(i).get(j)!=0) {
				matrix.get(i).set(j,-1);
			}
		}
	}
	static void markCol(ArrayList<ArrayList<Integer>> matrix, int j,int n){
		for(int i=0;i<n;i++) {
			if(matrix.get(i).get(j)!=0) {
				matrix.get(i).set(j,-1);
			}
		}
	}
	static ArrayList<ArrayList<Integer>> ZeroMatrix (ArrayList<ArrayList<Integer>> matrix, int n, int m){
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix.get(i).get(j)==0) {
					markRow(matrix,i,m);
					markCol(matrix,j,n);
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix.get(i).get(j)==-1) {
					matrix.get(i).set(j,0);
				}
			}
		}
		
		return matrix;
	}
	public static void main(String args[]) {
		
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,0,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
		
		int n=matrix.size();
		int m=matrix.get(0).size();
		
		ArrayList<ArrayList<Integer>> ans = ZeroMatrix(matrix,n,m);
		
		for(ArrayList<Integer> row : ans) {
			for(int ele : row) {
				System.out.print(ele+" ");
			}
			System.out.println("");
		}
	}

}
