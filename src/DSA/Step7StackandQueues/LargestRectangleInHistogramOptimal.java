package DSA.Step7StackandQueues;
import java.util.Stack;

public class LargestRectangleInHistogramOptimal{
	
	static int FindArea(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int maxarea = -1,area=-1;
		
		int i;
		for(i=0;i<n;i++) {
			
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int ele = arr[st.pop()];	
				area = (st.isEmpty()) ? ele*(i-(-1)-1) : ele*(i-st.peek()-1);
//				if(st.isEmpty()) area = area*(i-(-1)-1);
//				else area = area*(i-st.peek()-1);
				maxarea = Math.max(maxarea,area);
			}
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			int ele = arr[st.pop()];
			area = (st.isEmpty()) ? ele*(i-(-1)-1) : ele*(i-st.peek()-1);
//			if(st.isEmpty()) area = ele*(i-(-1)-1);
//			else area = ele*(i-st.peek()-1);
			maxarea = Math.max(maxarea,area);
		}
		
		return maxarea;
	}
	public static void main(String args[]) {
		int [] arr = {3, 2, 10, 11, 5, 10, 6, 3};
		int ans = FindArea(arr);
		System.out.print(ans);
	}
}
