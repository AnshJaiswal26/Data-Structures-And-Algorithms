package DSA.Step3Arrays.Hard;
import java.util.*;
public class A52LargestSubArrWithSum0Optimal {
	public static void main(String args[]) {
		Map<Integer,Integer> mpp = new HashMap<>();
		
		int[] arr = {1,-1,3,2,-2,-8,1,7,10,23};
		int s = arr.length;
		
		int sum=0;
		int k=0,maxl=Integer.MIN_VALUE;
		
		for(int i=0;i<s;i++) {
			sum=sum+arr[i];
			
			if(sum==k) {
				maxl=i+1;
			}
			else {
				int check = sum-k;
			
				if(mpp.containsKey(check)) {
				maxl=Math.max(maxl, i-mpp.get(check));
				}
			
				else{
				mpp.put(sum,i);
				}
			}
		 }
		
		System.out.print(maxl);
	}

}
