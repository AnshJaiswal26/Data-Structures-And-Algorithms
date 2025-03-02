package DSA.Step3Arrays.Medium;
import java.util.*;
public class B2PrintTheMatrixInSpiralMannerOptimal2 {
	
	static List<Integer> SpiralTraverse(int [][]matrix,int n,int m) {
	      int right = m-1;
	      int down = n-1;
	      int left = 0;
	      int top = 0;
	      
	      List<Integer> spiral = new ArrayList<>();
	      while(top<=down && left<=right) {
	    	  for(int i=left;i<=right;i++) {
	    		  spiral.add(matrix[top][i]);
	    	  }
	    		  top++;
	    	  
	    	  
	    	  for(int i=top;i<=down;i++) {
	    		  spiral.add(matrix[i][right]);
	    	  }
	    		  right--;
	    	  
	    	  if(top<= down) {
	    	  for(int i=right;i>=left;i--) {
	    		  spiral.add(matrix[down][i]);
	    	  }
	    		  down--;
	    	  }
	    	  
	    	  if(left<=right) {
	    	  for(int i=down;i>=top;i--) {
	    		  spiral.add(matrix[i][left]);
	    	  }
	    		  left++;
	    	  }
	      }
	      return spiral;
	      
	}
	
	public static void main(String args[]) {
		int[][] matrix = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
		
//			 1  2  3 4 
//			12 13 14 5
//			11 16 15 6
//			10  9  8 7
		int n = matrix.length;
		int m = matrix[0].length;
		
		 List<Integer> traverse = SpiralTraverse(matrix,n,m);
		
		for(int i=0;i<traverse.size();i++) {
			
				System.out.print(traverse.get(i)+" ");
			
		}
	
	}
	
}
