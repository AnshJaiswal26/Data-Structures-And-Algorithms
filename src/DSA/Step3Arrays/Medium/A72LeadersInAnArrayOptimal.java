package DSA.Step3Arrays.Medium;
import java.util.*;
public class A72LeadersInAnArrayOptimal {
	public static void main(String args[]) {
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(20,2,11,3,0,2));
		ArrayList<Integer> ans = new ArrayList<>();
		
		int s =arr.size();
		int end = s-1;
		int maxi = Integer.MIN_VALUE;
		
		while(end>=0) {
			
			if(arr.get(end)>maxi) {
				maxi=arr.get(end);
			    ans.add(maxi);
			}
			
			end--;
		}
		
		for(int val: ans) {
			System.out.print(val+" ");
		}
	}

}
