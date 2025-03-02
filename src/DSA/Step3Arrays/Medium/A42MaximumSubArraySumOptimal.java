package DSA.Step3Arrays.Medium;

public class A42MaximumSubArraySumOptimal {
	public static void main(String args[]) {
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		int maxi = Integer.MIN_VALUE,sum=0;
		int start=0,astart=-1,aend=-1,s=arr.length;
		
		for(int i=0;i<s;i++) {
			
			if(sum==0) {
				start=i;
			}
			
			sum=sum+arr[i];
					
			if(sum>maxi) {
				maxi=sum;
				astart=start;
				aend=i;
			}
			
			if(sum<0) {
				sum=0;
			}
		}
		
		System.out.print("Maximum Subarray sum is "+maxi+" & subarray index is "+astart+" to "+aend);
		
	}

}
