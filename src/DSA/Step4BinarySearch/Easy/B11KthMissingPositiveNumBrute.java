package DSA.Step4BinarySearch.Easy;

public class B11KthMissingPositiveNumBrute {
	public static void main(String args[]) {
		int[] arr = {2, 3, 4, 7, 11};
		int s = arr.length;
		int k=5;
		
		for(int i=0;i<s;i++) {
			if(arr[i]<=k) k++;
			else break;
		}
		
		System.out.print(k);
	}

}
