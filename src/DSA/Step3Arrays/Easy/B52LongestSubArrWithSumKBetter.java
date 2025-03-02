package DSA.Step3Arrays.Easy;
import java.util.*;
public class B52LongestSubArrWithSumKBetter {
	public static void main(String args[]) {
		int [] arr = {2,0,0,3};
		long k = 3;
		int len = longestsubarr(arr,k);
		
		System.out.print("Longest sum is "+len);
	}
	
	public static int longestsubarr(int arr[], long k) {
		Map<Long,Integer> preSumMap = new HashMap<>();
		int s=arr.length;
		
	    long sum = 0;
	    int maxlen = 0;
	    
	    for(int i=0;i<s;i++) {
	    	
	    	sum = sum + arr[i];
	    	
	    	if(sum == k) {
	    		maxlen = Math.max(maxlen,i+1);
	    	}
	    	
	    	long rem = sum-k;
	    	
	    	if(preSumMap.containsKey(rem)) {
	    		int len = i - preSumMap.get(rem);
	    		maxlen = Math.max(maxlen, len);
	    	}
	    	
	    	if(!preSumMap.containsKey(sum)) {
	    		preSumMap.put(sum,i);
	    	}
	    }
	    return maxlen;
	}

}
