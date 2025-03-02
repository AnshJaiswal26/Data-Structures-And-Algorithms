package DSA.Step3Arrays.Hard;
import java.util.*;
public class A43FourSumOptimal {
	
	static List<List<Integer>> Sum0(int [] arr,int s){
		List<List<Integer>> ans = new ArrayList<>();
		
		Arrays.sort(arr);
		for(int i=0;i<s;i++) {
			if(i>0 && arr[i]==arr[i-1]) continue;
			for(int j=i+1;j<s;j++) {
				if(j>i+1 && arr[j]==arr[j-1]) continue;
					int k = j+1;
					int l = s-1;
					
					while(k<l) {
						int sum = arr[i]+arr[j]+arr[k]+arr[l];
						if(k<l && sum<9) {
							k++;
						}
						else if(k<l && sum>9) {
							l--;
						}
						else {
							List<Integer> ls = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
							ans.add(ls);
							k++;
							l--;
							
							while(k<l && arr[k]==arr[k-1]) k++;
							while(k<l && arr[l]==arr[l+1]) l--;
						}
					}
			}
		}
	  return ans;
	}
	
	public static void main(String args[]) {
		int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
		int s = arr.length;
		
		List<List<Integer>> ans = Sum0(arr,s);
		
		for(List<Integer> row : ans) {
			for(int ele : row) {
				System.out.print(ele+" ");
			}
			System.out.println("");
		}
	}

}
