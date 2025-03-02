package DSA.Step3Arrays.Medium;

public class A81LongestConsecutiveSequenceBrute {
	
	public static boolean LinearSearch(int []arr,int num) {
		int s=arr.length;
		for(int i=0;i<s;i++){
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	public static int LongestConsecutive(int []arr) {
		int s= arr.length;
		int longest = 1;
		int count,x;
		
		for(int i=0;i<s;i++) {
			x=arr[i];
			count = 1;
			
			while(LinearSearch(arr,x+1)==true) {
				x=x+1;
				count++;
			}
			
			longest=Math.max(count,longest);
			
		}
		return longest;
		
	}
	public static void main(String args[]) {
		int[] arr = {100, 200, 201 ,202, 203, 204, 205, 1, 2, 3, 4, 5};
		int ans = LongestConsecutive(arr);
		
		System.out.print("Longest Consecutive Sequence Length is "+ans);
	}

}
