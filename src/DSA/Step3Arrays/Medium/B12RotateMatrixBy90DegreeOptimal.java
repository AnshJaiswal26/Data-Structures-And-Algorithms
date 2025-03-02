package DSA.Step3Arrays.Medium;
public class B12RotateMatrixBy90DegreeOptimal {
	
	static void  Transpose(int [][]matrix,int n,int m) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<m;j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				 matrix[j][i]=temp;	
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m/2;j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[i][n-j-1];
				matrix[i][n-j-1]=temp;	
			}
		}
		
	}
	
	public static void main(String args[]) {
		int[][] matrix = {{2,3,1,7},{5,1,0,8},{9,3,1,2},{7,1,2,0}}; 
			
		int n = matrix.length;
		int m = matrix[0].length;
		
		Transpose(matrix,n,m);
	    
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	
	}
	
}
