package DSA.Step7StackandQueues;
import java.util.ArrayList;
import java.util.List;

public class AsteroidCollisionOptimal {
	static List<Integer> AfterCollision(int[] arr) {
		List<Integer> st = new ArrayList<>();
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			
			if(st.isEmpty() || st.get(st.size()-1)<0 && arr[i]<0 || arr[i]>=0) st.add(arr[i]);
			
		   // else if(arr[i] >= 0) st.add(arr[i]);
			
			else {	
				if(st.get(st.size()-1)+arr[i] == 0) {
					st.remove(st.size()-1); 
				}
				else {
					
					while(!st.isEmpty() &&  st.get(st.size()-1)+arr[i]<0) {
						st.remove(st.size()-1);
					}
					
					if(st.isEmpty()) st.add(arr[i]);
				}
			}
		}
		
		
		return st;
	}
	public static void main(String args[]) {
		int[] arr = {4, 7, 1, 1, 2, -3, -7, 17, 15, -16};
		List<Integer> ans = AfterCollision(arr);
		
		for(int it : ans) {
			System.out.print(it+" ");
		}
	}
}
