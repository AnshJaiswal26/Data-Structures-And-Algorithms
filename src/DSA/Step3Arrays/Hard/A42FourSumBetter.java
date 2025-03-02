package DSA.Step3Arrays.Hard;
import java.util.*;
public class A42FourSumBetter {
	static List<List<Integer>> Sum0(int[] arr,int s){
		Set<List<Integer>> st = new HashSet<>();
		int target = 9;
		
		for(int i=0;i<s;i++) {	
			for(int j=i+1;j<s;j++) {
				Set<Integer> hashset = new HashSet<>();
				for(int k=j+1;k<s;k++) {
				int fourth = target-(arr[i]+arr[j]+arr[k]);
				if(hashset.contains(fourth)) {
					List<Integer> ls = Arrays.asList(arr[i],arr[j],arr[k],fourth);
					ls.sort(null);
					st.add(ls);
			     	}
				hashset.add(arr[k]);
				}
				
			}
		}
		List<List<Integer>> ans =new ArrayList<>(st);
		return ans;
	}
	public static void main(String args[]) {
		int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
		int s= arr.length;
		
		List<List<Integer>> ans = Sum0(arr,s);
		
		for(List<Integer> row : ans) {
			for(int ele : row) {
				System.out.print(ele+" ");
			}
			System.out.println("");
		}
	}

}
