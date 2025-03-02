package DSA.Step3Arrays.Hard;
import java.util.*;
public class A72MergeOverlappingSubintervalsOptimal {
	
		static List<List<Integer>> Merge(int [][]arr , int s){
			Arrays.sort(arr,new Comparator<int[]>() { 
				public int compare(int[] a, int[] b) {
					return a[0] - b[0];
					}
				});
			
			List<List<Integer>> ans = new ArrayList<>();
			 	
				int start = arr[0][0];
				int end = arr[0][1];
				
				
				for(int i=1;i<s;i++) {
					if(arr[i][0]<=end) {
						end= Math.max(end,arr[i][1]);
					}
					else {
						List<Integer> store = Arrays.asList(start,end);
						ans.add(store);
						
						start = arr[i][0];
						end = arr[i][1];
					}
					
				}
				List<Integer> store = Arrays.asList(start,end);
				ans.add(store);
				
			return ans;
		}
		
		public static void main(String args[]) {
			int [][] arr = {{1, 3}, {2, 6}, {8, 9}, {9, 11}, {8, 10}, {2, 4}, {15, 18},{16, 17}};
			int s = arr.length;
			
			List<List<Integer>> ans = Merge(arr,s);
			
			for(List<Integer> row : ans) {
				
					System.out.print("["+row.get(0)+","+row.get(1)+"]"+" ");
			
			}
		}

	}


