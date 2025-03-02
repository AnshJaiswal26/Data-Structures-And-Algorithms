package DSA.Step3Arrays.Hard;
import java.util.*;
public class A41FourSumBrute {
	static List<List<Integer>> Sum0(int []arr,int s){
		
		Set<List<Integer>> ans = new HashSet<>();
		
		for(int i=0;i<s;i++) {
			for(int j=i+1;j<s;j++) {
				for(int k=j+1;k<s;k++) {
					for(int l=k+1;l<s;l++) {
					 if(arr[i]+arr[j]+arr[k]+arr[l]==9) {
						List<Integer> ls = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);	
						ls.sort(null);
						ans.add(ls);
					 }
					}
				}
			}
		}
		
		List<List<Integer>> ans1 = new ArrayList<>(ans);
		
		return ans1;
	}
	public static void main(String args[]) {
		int [] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
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
