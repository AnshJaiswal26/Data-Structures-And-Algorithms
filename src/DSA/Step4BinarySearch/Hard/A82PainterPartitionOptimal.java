package DSA.Step4BinarySearch.Hard;

public class A82PainterPartitionOptimal {
	
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
	
	static int Partition(int[] arr,int l,int i) {
		int pcnt=1,tsum=0;
		for(int j=0;j<l;j++) {
			if(tsum+arr[j]<=i) {
				tsum+=arr[j];
			}
			else {
				tsum=arr[j];
				pcnt++;
			}
		}
		return pcnt;
	}
	
	static int MinTime(int[] arr,int l,int k) {
		int s=max(arr,l),e=Sum(arr,l);
		
		while(s<=e){	
			int mid = s+(e-s)/2;
			
			if(Partition(arr,l,mid)<=k) {
				e=mid-1;;
			}
			else {
				s=mid+1;
			}
		}
		return s;
	}
	public static void main(String args[]) {
		int[] arr = {10, 20, 30, 40};
		int l = arr.length;
		int k=2;
		
		int ans = MinTime(arr,l,k);
		
		System.out.print(ans);
	}

}
