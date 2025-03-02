package DSA.Step3Arrays.Hard;
import java.util.*;
public class A32ThreeSumEqto0Better {
	static List<List<Integer>> Sum0(int[] arr,int s){
		Set<List<Integer>> st = new HashSet<>();
		
		for(int i=0;i<s;i++) {
			Set<Integer> hashset = new HashSet<>();
			for(int j=i+1;j<s;j++) {
				int third = -(arr[i]+arr[j]);
				if(hashset.contains(third)) {
					List<Integer> ls = Arrays.asList(arr[i],arr[j],third);
					ls.sort(null);
					st.add(ls);
				}
				hashset.add(arr[j]);
			}
		}
		List<List<Integer>> ans =new ArrayList<>(st);
		return ans;
	}
	public static void main(String args[]) {
		int[] arr = {-1, -1, 2, 0, 1};
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
