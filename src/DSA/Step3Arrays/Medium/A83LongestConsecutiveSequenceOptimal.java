package DSA.Step3Arrays.Medium;
import java.util.*;
public class A83LongestConsecutiveSequenceOptimal {
	
	public static int LongestConsecutiveSeq(int []arr) {
		
		int s= arr.length;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<s;i++){
			set.add(arr[i]);
		}
	
		int count,longest=1,x;
		
		for(int it : set) {
			
			if(!set.contains(it-1)) {
				count =1;
				x=it;
				
				while(set.contains(x+1)) {
					count++;
					x=x+1;
				}
				longest=Math.max(count,longest);
			}
		}
		return longest;	
	}
	public static void main(String args[]) {
		int[] arr = {1,2,6,4,21,22,23,24,25};
		int ans = LongestConsecutiveSeq(arr);
		
		System.out.print(ans);
	}

}
