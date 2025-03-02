package DSA.Step7StackandQueues;
import java.util.Stack;

public class MaximalRectangleOptimal {
	static int Area(int[]NewMatrix) {
		Stack<Integer> st = new Stack<>();
		int m = NewMatrix.length;
		int maxarea = -1;
		
		int i;
		for(i=0;i<m;i++) {
			while(!st.isEmpty() && NewMatrix[i]<NewMatrix[st.peek()]) {
				int ele = NewMatrix[st.pop()];
				int area = (st.isEmpty()) ? ele*(i-(-1)-1) : ele*(i-(st.peek())-1);
				maxarea = Math.max(maxarea, area);
			}
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			int ele = NewMatrix[st.pop()];
			int area = (st.isEmpty()) ? ele*(i-(-1)-1) : ele*(m-(st.peek())-1);
			maxarea = Math.max(maxarea, area);
		}
		return maxarea;
	}
	
	static int FindMaxRec(int[][] matrix) {
		int m = matrix[0].length;
		int n = matrix.length;
		int[][] NewMatrix = new int[n][m];
		
		
		for(int j=0;j<m;j++) {
			int sum=0;
			
			for(int i=0;i<n;i++) {
				sum+=matrix[i][j];
				
				if(matrix[i][j] == 0) sum=0;
				NewMatrix[i][j] = sum;
				
			}
		}
		int Maxarea = -1;
		
		for(int i=0;i<n;i++) {
			Maxarea = Math.max(Area(NewMatrix[i]),Maxarea);
		}
		
		return Maxarea;
	}
	
	public static void main(String args[]) {
		int[][] matrix = {{1, 0, 1, 0, 1},{1, 0, 1, 1, 1},{1, 1, 1, 1, 1},{1, 0, 0, 1, 0}};
		
		int ans = FindMaxRec(matrix);
		System.out.println(ans);
	}
}
