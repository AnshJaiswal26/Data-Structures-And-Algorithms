package DSA.Step7StackandQueues;
import java.util.Stack;

// Pending
public class NumberOfNGEsToRightOptimal{
	static int[] FindNGE(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int[] NGE = new int[arr.length];
		
		for(int i=n-1;i>=0;i--) {
			
			while(!st.isEmpty() && arr[i]>=st.peek()) st.pop();
			
			if(st.isEmpty()) {
				NGE[i] = 0;
			}
			else {
				NGE[i] = st.size();	
			}
			
			st.push(arr[i]);
		}
		return NGE;
	}
	public static void main(String args[]) {
		int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
		//           0   1  2  3  4  5  6  7  8  9  10 11 12
		//                                             
		int[] NGEarr = FindNGE(arr);
		
		for(int i=0;i<NGEarr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nNext Greater Element of Every Element");
		for(int i=0;i<NGEarr.length;i++) {
			System.out.print(NGEarr[i]+" ");
		}
	}
}
