package DSA.Step3Arrays.Hard;
import java.util.*;
public class A33ThreeSumEqto0Optimal {
	static List<List<Integer>> Sum0(int[] arr,int s){
		List<List<Integer>> totaltriplets = new ArrayList<>();
		
		for(int i=0;i<s;i++) {
			if(i>0 && arr[i]==arr[i-1]) continue;
			
			int j=i+1;
			int k=s-1;
			
			while(j<k) {
				int sum = arr[i]+arr[k]+arr[j];
				
				if(j<k && sum<0) {
					j++;
				}
				else if(j<k && sum>0) {
					k--;
				}
				else {
					List<Integer> triplets = Arrays.asList(arr[i],arr[j],arr[k]);
					totaltriplets.add(triplets);
					j++;
					k--;
					while(j<k && arr[j]==arr[j-1]) j++;
					while(j<k && arr[k]==arr[k+1]) k--;
					
				}
			}
			
		}
		return totaltriplets;
	}
	public static void main(String args[]) {
		int[] arr = { -1, 0, 1, 2, -1, -4};
		int s = arr.length;
		
		Arrays.sort(arr);
		List<List<Integer>> ans = Sum0(arr,s);
		
		for(List<Integer> row : ans) {
			for(int ele : row) {
				System.out.print(ele+" ");
			}
			System.out.println("");
		}
	}

}
