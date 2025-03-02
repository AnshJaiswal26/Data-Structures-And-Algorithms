package DSA.Step3Arrays.Medium;
import java.util.*;
public class A92SetMatrixZerosBetter {
	static ArrayList<ArrayList<Integer>>  ZeroMarix(ArrayList<ArrayList<Integer>> matrix ,int n, int m){
		int[] markrow =  new int[m];
	    int[] markcol = new int[m];
	    Arrays.fill(markrow,0);
	    Arrays.fill(markcol,0);
	     
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix.get(i).get(j)==0) {
					markrow[i]=1;
					markcol[j]=1;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(markrow[i]==1 || markcol[j]==1) {
					matrix.get(i).set(j,0);
				}
			}
		}
		return matrix;
	}
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,1,0,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
		
		int n = matrix.size();
		int m = matrix.get(0).size();
		
		ArrayList<ArrayList<Integer>> ans = ZeroMarix(matrix,n,m);
		
		for(ArrayList<Integer> row : ans) {
			for(int ele : row) {
				System.out.print(ele+" ");
			}
			System.out.println("");
		}
	}

}
