package DSA.Step7StackandQueues;

public class TheCelebrityProblemBrute {
	static int FindCelebrity(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		int iknow[] = new int[n];
		int knowme[] = new int[n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix[i][j]==1) {
					knowme[j]+=1;
					iknow[i]+=1; 
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			if(knowme[i] == n-1 && iknow[i] == 0) return i;
		}
		
		
		return -1;
	}
	public static void main(String args[]) {
		int[][] matrix = {{0, 1, 1, 0},{0, 0, 0, 0},{0, 1, 0, 0},{1, 1, 0, 0}};
		int ans = FindCelebrity(matrix);
		System.out.print(ans);
	}
}
