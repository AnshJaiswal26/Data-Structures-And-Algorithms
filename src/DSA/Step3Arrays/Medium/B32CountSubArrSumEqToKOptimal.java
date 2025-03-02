package DSA.Step3Arrays.Medium;
import java.util.*;
public class B32CountSubArrSumEqToKOptimal {
	public static void main(String args[]) {
	int[] arr = {1,2,3,-3,1,1,1,6};
	int s = arr.length;
	int k=3;
	Map<Integer,Integer> mpp = new HashMap<>();
	
	int presum=0;
	int count =0;
	mpp.put(0,1);
	
	for(int i=0;i<s;i++) {
		presum = presum+arr[i];
		
		int rem = presum-k;
		
		count=count+mpp.getOrDefault(rem,0);
		
		mpp.put(presum,mpp.getOrDefault(presum, 0)+1);
	}
	
	System.out.print(count);
	
	}
}
