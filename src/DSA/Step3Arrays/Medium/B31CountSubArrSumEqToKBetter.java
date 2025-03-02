package DSA.Step3Arrays.Medium;

public class B31CountSubArrSumEqToKBetter {
	public static void main(String args[]) {
		
		int[] arr = {1,2,3,-3,1,1,1,6};
		int s = arr.length;
		int k= 3;
		int count=0;
		
		for(int i=0;i<s;i++) {
			int sum =0;
			for(int j=i;j<s;j++) {
				sum = sum+arr[j];
				if(sum==k) {
					count++;
				}
			}
		}
		
		System.out.print(count);
	}

}
