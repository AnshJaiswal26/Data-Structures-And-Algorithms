package DSA.Step3Arrays.Hard;
import java.util.*;
public class A31ThreeSumEqto0Brute {
	static List<List<Integer>> Sum0(int []arr,int s){
		
		Set<List<Integer>> ans = new HashSet<>();
		
		for(int i=0;i<s;i++) {
			for(int j=i+1;j<s;j++) {
				for(int k=j+1;k<s;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						List<Integer> ls = Arrays.asList(arr[i],arr[j],arr[k]);	
						ls.sort(null);
						ans.add(ls);
					}
				}
			}
		}
		
		List<List<Integer>> ans1 = new ArrayList<>(ans);
		
		return ans1;
	}
	public static void main(String args[]) {
		int [] arr = {-1,0,1,2,-1,-4};
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
