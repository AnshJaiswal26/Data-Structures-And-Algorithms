package DSA.Step4BinarySearch.Hard;

public class A71SplitArrLargestSumBrute {	
	static int max(int[] arr,int l) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<l;i++) {
			if(arr[i]>max) max=arr[i];
		}
		return max;
	}
	
	static int Sum(int[] arr,int l) {
		int sum = 0;
		
		for(int i=0;i<l;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	static int Split(int[] arr,int l,int i) {
		int partcnt=1,elesum=0;
		for(int j=0;j<l;j++) {
			if(elesum+arr[j]<=i) {
				elesum+=arr[j];
			}
			else {
				elesum=arr[j];
				partcnt++;
			}
		}
		return partcnt;
	}
	
	static int MinSum(int[] arr,int l,int k) {
		for(int i=max(arr,l);i<Sum(arr,l);i++){	
			if(Split(arr,l,i)==k) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int[] arr = {10, 20, 30, 40};
		int l = arr.length;
		int k=2;
		
		int ans = MinSum(arr,l,k);
		
		System.out.print(ans);
	}

}
