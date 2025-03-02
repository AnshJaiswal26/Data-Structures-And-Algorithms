package DSA.Step7StackandQueues;

public class TheCelebrityProblemOptimal{
	static int FindCelebrity(int[][] matrix) {
		int n = matrix.length;
		int top = 0;
		int down = n-1;
		
		while(top<down) {
			if(matrix[top][down] == 1) top++;
			else if(matrix[down][top] == 1) down--;
			else {
				top++;
				down--;
			}
		}
		
		if(top>down) return -1;
		
		for(int i=0;i<n;i++) {
			 
			if(top==i) continue;
			
			if(matrix[top][i] == 0 && matrix[i][top] == 1) ; 
			else return -1;
		}
		
		return top;
	}
	public static void main(String args[]) {
		int[][] matrix = {{0, 1, 1, 0},{0, 0, 0, 0},{0, 1, 0, 0},{1, 1, 0, 0}};
		int ans = FindCelebrity(matrix);
		System.out.print(ans);
	}
}
