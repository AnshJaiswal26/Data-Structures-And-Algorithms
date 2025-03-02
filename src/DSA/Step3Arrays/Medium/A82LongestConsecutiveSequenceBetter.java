package DSA.Step3Arrays.Medium;

public class A82LongestConsecutiveSequenceBetter {
	public static void main(String args[]) {
		
		int[] arr = {2,3,1,11,12,13,14,15};
		int s=arr.length;
		
		int count=0,longest =1 ,lastsmaller=Integer.MIN_VALUE;
		
		for(int i=0;i<s;i++) {
			
			if(arr[i]-1==lastsmaller) {
				count++;
				lastsmaller=arr[i];
			}
			
			else if(arr[i]!=lastsmaller){
				count=1;
				lastsmaller=arr[i];
			}
			
			longest=Math.max(longest,count);
		}
		System.out.print("Longest Consecutive length "+longest);
	
	}

}
