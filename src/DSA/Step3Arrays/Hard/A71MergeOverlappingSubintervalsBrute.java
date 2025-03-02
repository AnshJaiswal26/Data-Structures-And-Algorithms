package DSA.Step3Arrays.Hard;
import java.util.*;
public class A71MergeOverlappingSubintervalsBrute {
	static List<List<Integer>> Merge(int [][]arr , int s){
		Arrays.sort(arr,new Comparator<int[]>() { 
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
				}
			});
		
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int i=0;i<s;i++) {
		
			int start = arr[i][0];
			int end = arr[i][1];
			
			if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)) continue;
			
			
			for(int j=i+1;j<s;j++) {
				if(arr[j][0]<=end) {
					end= Math.max(end,arr[j][1]);
				}
				else {
					break;
				}
				
			}
			
			List<Integer> store = Arrays.asList(start,end);
			ans.add(store);
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		int [][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
		int s = arr.length;
		
		List<List<Integer>> ans = Merge(arr,s);
		
		for(List<Integer> row : ans) {
			
				System.out.print("["+row.get(0)+","+row.get(1)+"]"+" ");
		
		}
	}

}
