package DSA.Step7StackandQueues;
import java.util.Stack;

public class NextGreaterElementStackOptimal {
	static int[] FindNGE(int[] arr) {
		Stack<Integer> st = new Stack<>();
		// Using Monotonic Stack (Storing elements in stack in specified order)
		int n = arr.length;
		int[] NGE = new int[arr.length];
		
		for(int i=n-1;i>=0;i--) {
			while(!st.isEmpty() && arr[i]>=st.peek()) st.pop();
			if(st.isEmpty()) {
				NGE[i] = -1;
			}
			else {
				NGE[i] = st.peek();	
			}
			st.push(arr[i]);
		}
		return NGE;
	}
	public static void main(String args[]) {
		int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
		
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
